/*-
 * ================================================================================
 * ECOMP Portal SDK
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
package org.onap.portalapp.conf;

import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import org.onap.portalsdk.core.conf.HibernateMappingLocatable;

@Component
@Profile("src")
public class HibernateMappingLocations implements HibernateMappingLocatable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openecomp.portalsdk.core.conf.HibernateMappingLocatable#
	 * getMappingLocations()
	 */
	@Override
	public Resource[] getMappingLocations() {
		return new Resource[] {
				// Path is relative to WEB-INF/conf;
				// a leading slash gets stripped so don't bother.
				new ClassPathResource("../fusion/orm/Fusion.hbm.xml"),
				new ClassPathResource("../dbcapp/dbcapp.hbm.xml")
		};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openecomp.portalsdk.core.conf.HibernateMappingLocatable#
	 * getPackagesToScan()
	 */
	@Override
	public String[] getPackagesToScan() {
		return new String[] { "org.onap", "org.openecomp" };
	}

}
