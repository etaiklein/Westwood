/* ===============
 * Eastwood Charts
 * ===============
 *
 * (C) Copyright 2007, 2008, by Object Refinery Limited.
 *
 * Project Info:  http://www.jfree.org/eastwood/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * ---------------------
 * ChartEngineTests.java
 * ---------------------
 * (C) Copyright 2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 *
 * Changes
 * -------
 * 27-Jun-2008 : Version 1 (DG);
 *
 */

package org.jfree.eastwood.junit;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.eastwood.ChartEngine;
import org.jfree.eastwood.Parameters;

/**
 * Tests for the {@link ChartEngine} class.
 */
public class ChartEngineTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ChartEngineTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ChartEngineTests(String name) {
        super(name);
    }

    /**
     * A test for bug report 2001830.
     *
     * @throws UnsupportedEncodingException
     */
    public void test2001830() throws UnsupportedEncodingException {
    	String paramStr = "cht=bhs&chco=ff0000|00ff00|0000ff,&chs=200x125" +
    	        "&chd=s:elo&chxt=x,y&chxl=1:|Dec|Nov|Oct|0:||20K||60K||100K|";
    	Map params = Parameters.parseQueryString(paramStr);
    	/* JFreeChart chart = */ ChartEngine.buildChart(params);
    }

}