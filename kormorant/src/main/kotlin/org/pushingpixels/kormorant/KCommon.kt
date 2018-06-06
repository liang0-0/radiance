/*
 * Copyright (c) 2018 Radiance Kormorant Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of Radiance Kormorant Kirill Grouchnikov nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.kormorant

import org.pushingpixels.flamingo.api.common.FlamingoCommand
import org.pushingpixels.flamingo.api.common.RichTooltip
import org.pushingpixels.neon.icon.ResizableIcon
import java.awt.Color
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class NullableDelegate<T>(private val gate: Any?) : ReadWriteProperty<Any, T?> {
    private var value: T? = null

    override fun getValue(thisRef: Any, property: KProperty<*>): T? {
        return value
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
        if (gate != null) {
            throw IllegalStateException("Cannot modify field after converting to Swing component")
        }
        this.value = value
    }
}

class NonNullDelegate<T : Any>(private val gate: Any?) {
    private lateinit var value: T
    private var isInitialized = false

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        if (!this.isInitialized) {
            throw UninitializedPropertyAccessException(property.name)
        }
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        if (gate != null) {
            throw IllegalStateException("Cannot modify field after converting to Swing component")
        }
        this.isInitialized = true
        this.value = value
    }
}

// Annotation to control the receiver scoping in the DSL
@DslMarker
annotation class FlamingoElementMarker

@FlamingoElementMarker
class TextContainer {
    internal val strings = arrayListOf<String>()

    operator fun String.unaryPlus() {
        strings.add(this)
    }
}

@FlamingoElementMarker
class ColorContainer {
    internal val colors = arrayListOf<Color>()

    operator fun Color.unaryPlus() {
        colors.add(this)
    }
}

@FlamingoElementMarker
class KRichTooltip {
    lateinit var title: String
    var mainIcon: ResizableIcon? = null
    private val descriptionSections = TextContainer()
    var footerIcon: ResizableIcon? = null
    private val footerSections = TextContainer()

    fun description(init: TextContainer.() -> Unit) {
        descriptionSections.init()
    }

    fun footer(init: TextContainer.() -> Unit) {
        footerSections.init()
    }

    fun buildRichTooltip(): RichTooltip {
        val builder = RichTooltip.RichTooltipBuilder()
        builder.setTitle(title)
        builder.setMainIcon(mainIcon)
        for (descriptionSection in descriptionSections.strings) {
            builder.addDescriptionSection(descriptionSection)
        }
        builder.setFooterIcon(footerIcon)
        for (footerSection in footerSections.strings) {
            builder.addFooterSection(footerSection)
        }

        return builder.build()
    }
}

class KCommandToggleGroup {
    internal val flamingoCommandToggleGroup = FlamingoCommand.FlamingoCommandToggleGroup()
}

fun commandToggleGroup(): KCommandToggleGroup {
    return KCommandToggleGroup()
}




