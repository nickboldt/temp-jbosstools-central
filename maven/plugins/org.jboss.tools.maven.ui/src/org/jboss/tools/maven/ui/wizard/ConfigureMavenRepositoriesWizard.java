/*************************************************************************************
 * Copyright (c) 2010-2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.jboss.tools.maven.ui.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.jboss.tools.maven.ui.Activator;

/**
 * 
 * @author snjeza
 *
 */
public class ConfigureMavenRepositoriesWizard extends Wizard implements
		INewWizard {

	private ConfigureMavenRepositoriesWizardPage page;

	public ConfigureMavenRepositoriesWizard() {
		super();
		setWindowTitle("Maven Repositories");
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		initializeDefaultPageImageDescriptor();
	}

	private void initializeDefaultPageImageDescriptor() {
		ImageDescriptor desc = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						"icons/repo_wiz.gif"); //$NON-NLS-1$
		setDefaultPageImageDescriptor(desc);
	}
	
	@Override
	public boolean performFinish() {
		return page.finishPage();
	}

	@Override
	public void addPages() {
		page = new ConfigureMavenRepositoriesWizardPage();
		addPage(page);
	}
}
