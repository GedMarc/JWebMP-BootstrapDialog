import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bootstrap.dialog.BSDialogPageConfigurator;

module com.jwebmp.plugins.bootstrap.dialog {
	exports com.jwebmp.plugins.bootstrap.dialog;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	provides IPageConfigurator with BSDialogPageConfigurator;
}
