import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootstrap.dialog.BSDialogPageConfigurator;

module com.jwebmp.plugins.bootstrap.dialog {
	exports com.jwebmp.plugins.bootstrap.dialog;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BSDialogPageConfigurator;

	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.bootstrap.dialog.implementations.BootstrapDialogExclusionsModule;
	provides IGuiceScanJarExclusions with com.jwebmp.plugins.bootstrap.dialog.implementations.BootstrapDialogExclusionsModule;

	opens com.jwebmp.plugins.bootstrap.dialog to com.fasterxml.jackson.databind, com.jwebmp.core;
}
