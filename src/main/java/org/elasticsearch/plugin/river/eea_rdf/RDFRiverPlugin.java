package org.elasticsearch.plugin.river.eea_rdf.eea_rdf_river_plugin;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.river.RiversModule;
import org.elasticsearch.river.eea_rdf.RDFRiverModule;
import org.elasticsearch.river.eea_rdf.settings.EEASettings;

/**
 * @author iulia, EEA
 */
public class RDFRiverPlugin extends AbstractPlugin {

	@Inject
	public RDFRiverPlugin(){
	}

        @Override
	public String name() {
		return EEASettings.RIVER_PLUGIN_NAME;
	}

        @Override
	public String description() {
		return "Turtle RDF River Plugin";
	}

	public void onModule(RiversModule module) {
		module.registerRiver(EEASettings.RIVER_SETTINGS_KEY, RDFRiverModule.class);
	}
}

