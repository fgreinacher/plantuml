
/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2023, Arnaud Roques
 *
 * Project Info:  http://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 * 
 * http://plantuml.com/patreon (only 1$ per month!)
 * http://plantuml.com/paypal
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
 * Original Author:  Thomas Woyke, Robert Bosch GmbH
 *
 */
package net.sourceforge.plantuml.genericdiagram.data;

import net.sourceforge.plantuml.genericdiagram.GenericEntityType;
import net.sourceforge.plantuml.genericdiagram.IGenericStereotype;
import net.sourceforge.plantuml.genericdiagram.genericprocessing.IGenericDiagramVisitor;

public class GenericStereotype extends GenericModelElement implements IGenericStereotype {

	public GenericStereotype() {
		this.type = GenericEntityType.STEREOTYPE;

	}
	public GenericStereotype(int elementCount) {

		super(elementCount);
		this.type = GenericEntityType.STEREOTYPE;
	}

	@Override
	public void acceptVisitor(IGenericDiagramVisitor visitor) {
		visitor.visitStereotype(this);
	}

	@Override
	public boolean isStereotype(){
		return true;
	}
}
