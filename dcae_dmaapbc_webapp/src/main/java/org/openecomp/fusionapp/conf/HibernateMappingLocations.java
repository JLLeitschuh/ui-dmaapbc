/*-
 * ================================================================================
 * DCAE DMaaP Bus Controller Web Application
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ================================================================================
 */
package org.openecomp.fusionapp.conf;

import org.openecomp.portalsdk.core.conf.HibernateMappingLocatable;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
@Profile("src")
public class HibernateMappingLocations implements HibernateMappingLocatable {
	
	public Resource[] getMappingLocations() {
		return new Resource[] { 
				// Path is relative to WEB-INF/conf;
				// a leading slash gets stripped so don't bother.
				new ClassPathResource("../fusion/orm/Fusion.hbm.xml"),
				// DBC does not use workflow nor RCloud
				// new ClassPathResource("../fusion/orm/Workflow.hbm.xml"),
				// new ClassPathResource("../fusion/orm/RNoteBookIntegration.hbm.xml"),
				new ClassPathResource("../dbcapp/dbcapp.hbm.xml")	
		};
	}
     

}