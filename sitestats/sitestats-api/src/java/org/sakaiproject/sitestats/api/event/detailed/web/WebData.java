/**
 * Copyright (c) 2006-2018 The Apereo Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sakaiproject.sitestats.api.event.detailed.web;

import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.sakaiproject.sitestats.api.event.detailed.ResolvedEventData;

/**
 * Data for a web content tool
 * @author plukasew
 */
public class WebData implements ResolvedEventData
{
	public final String pageName;
	public final Optional<String> toolName;
	public final String url;

	/**
	 * Constructor
	 * @param pageName the name of the page
	 * @param toolName the name of the tool (may be null if not set)
	 * @param url the url the web content tool points to
	 */
	public WebData(String pageName, String toolName, String url)
	{
		this.pageName = pageName;
		this.toolName = Optional.ofNullable(StringUtils.trimToNull(toolName));
		this.url = url;
	}
}
