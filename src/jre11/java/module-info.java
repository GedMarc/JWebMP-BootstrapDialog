module com.jwebmp.plugins.bootstrap.dialog {
	exports com.jwebmp.plugins.bootstrap.dialog;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootstrap.dialog.BSDialogPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bootstrap.dialog.implementations.BootstrapDialogExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bootstrap.dialog.implementations.BootstrapDialogExclusionsModule;

	opens com.jwebmp.plugins.bootstrap.dialog to com.fasterxml.jackson.databind, com.jwebmp.core;
}
