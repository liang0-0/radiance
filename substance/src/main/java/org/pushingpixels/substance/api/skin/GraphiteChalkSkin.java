/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of the copyright holder nor the names of
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
package org.pushingpixels.substance.api.skin;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;

/**
 * <code>Graphite Chalk</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class GraphiteChalkSkin extends GraphiteSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Graphite Chalk";

	/**
	 * Creates a new <code>Graphite Chalk</code> skin.
	 */
	public GraphiteChalkSkin() {
		SubstanceSkin.ColorSchemes schemes = SubstanceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
						"org/pushingpixels/substance/api/skin/graphite.colorschemes"));

		SubstanceColorScheme chalkScheme = schemes.get("Chalk");
		defaultSchemeBundle.registerColorScheme(chalkScheme,
				ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(chalkScheme, ColorSchemeAssociationKind.BORDER,
				ComponentState.ENABLED);
		defaultSchemeBundle.registerColorScheme(chalkScheme, ColorSchemeAssociationKind.BORDER,
				ComponentState.getActiveStates());
		defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED,
				ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_DEFAULT);
		defaultSchemeBundle.registerColorScheme(chalkScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_UNSELECTED,
				ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_DEFAULT);
		defaultSchemeBundle.registerColorScheme(chalkScheme,
				ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState.getActiveStates());

		SubstanceColorScheme markScheme = schemes.get("Graphite Mark");
		defaultSchemeBundle.registerColorScheme(markScheme, ColorSchemeAssociationKind.MARK);

		SubstanceColorScheme separatorScheme = schemes.get("Chalk Separator");
		defaultSchemeBundle.registerColorScheme(separatorScheme,
				ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);

		this.borderPainter = new ClassicBorderPainter();
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}
}
