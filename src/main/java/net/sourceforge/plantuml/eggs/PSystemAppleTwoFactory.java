/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2024, Arnaud Roques
 *
 * Project Info:  https://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 * 
 * https://plantuml.com/patreon (only 1$ per month!)
 * https://plantuml.com/paypal
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 *
 * Original Author:  Arnaud Roques
 * 
 *
 */
package net.sourceforge.plantuml.eggs;

import java.io.IOException;

import net.sourceforge.plantuml.AbstractPSystem;
import net.sourceforge.plantuml.command.PSystemSingleLineFactory;
import net.sourceforge.plantuml.core.UmlSource;
import net.sourceforge.plantuml.log.Logme;
import net.sourceforge.plantuml.preproc.PreprocessingArtifact;
import net.sourceforge.plantuml.utils.Log;

public class PSystemAppleTwoFactory extends PSystemSingleLineFactory {
	// ::remove file when __CORE__

	@Override
	protected AbstractPSystem executeLine(UmlSource source, String line, PreprocessingArtifact preprocessing) {
		if (line.equalsIgnoreCase("apple //e") || line.equalsIgnoreCase("apple ][") || line.equalsIgnoreCase("apple II")
				|| line.equalsIgnoreCase("Steve Jobs") || line.equalsIgnoreCase("Steve Wozniak")) {
			try {
				return new PSystemAppleTwo(source, preprocessing);
			} catch (IOException e) {
				Log.error("Error " + e);
				Logme.error(e);
			}
		}
		return null;
	}

}
