/*************************************************************************************
 * Copyright (c) 2008-2011 JBoss by Red Hat and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.jboss.tools.maven.cdi;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author snjeza
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.jboss.tools.maven.cdi.messages"; //$NON-NLS-1$
	public static String CDIProjectConfigurator_The_project_does_not_contain_the_Web_Module_facet;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
