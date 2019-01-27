package com.jwebmp.plugins.bootstrap4.dialog.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BootstrapDialogExclusionsModule
		implements IGuiceScanModuleExclusions<BootstrapDialogExclusionsModule>,
				           IGuiceScanJarExclusions<BootstrapDialogExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap-dialog-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bootstrap.dialog");
		return strings;
	}
}
