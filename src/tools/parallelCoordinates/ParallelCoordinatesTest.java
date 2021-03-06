/******************************************************************************
 * Copyright (C) 2007  Institute for Visualization and Perception Research,
 *                     University of Massachusetts Lowell
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package tools.parallelCoordinates;

import jyVis.JyVis;
import jyVis.JyVisLauncher;
import scripting.ScriptBottleneck;

public class ParallelCoordinatesTest {

	public static void main(String[] args) {
		JyVisLauncher.launchJyVis();
		JyVis.openDataTable("run/data/iris.csv");
		ScriptBottleneck.execfile("run/Visualizations/Parallel Coordinates.py");
	}

}
