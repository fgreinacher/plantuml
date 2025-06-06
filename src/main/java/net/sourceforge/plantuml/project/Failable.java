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
package net.sourceforge.plantuml.project;

public class Failable<O> {

	private final O data;
	private final String error;
	private final int score;

	public static <O> Failable<O> ok(O data) {
		return new Failable<>(data, null, 0);
	}

	public static <O> Failable<O> error(String error) {
		return new Failable<>(null, error, 0);
	}

	public static <O> Failable<O> error(String error, int score) {
		return new Failable<>(null, error, score);
	}

	private Failable(O data, String error, int score) {
		if (data == null && error == null)
			throw new IllegalArgumentException();

		if (data != null && error != null)
			throw new IllegalArgumentException();

		this.data = data;
		this.error = error;
		this.score = score;
	}

	public O get() {
		if (data == null)
			throw new IllegalStateException();

		return data;
	}

	public boolean isFail() {
		return data == null;
	}

	public String getError() {
		if (error == null)
			throw new IllegalStateException();

		return error;
	}

	public int getScore() {
		if (error == null)
			throw new IllegalStateException();
		
		return score;
	}


}
