/* LanguageTool plugin for Oxygen XML editor 
 * Copyright (C) 2014 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.oxygen;

import ro.sync.exml.plugin.Plugin;
import ro.sync.exml.plugin.PluginDescriptor;

/**
 * LanguageTool plugin for Oxygen.
 */
public class LanguageToolPlugin extends Plugin {

  private static LanguageToolPlugin instance = null;

  public static LanguageToolPlugin getInstance() {
    return instance;
  }
  
  public LanguageToolPlugin(PluginDescriptor descriptor) {
    super(descriptor);
    if (instance != null) {
      throw new IllegalStateException("Already instantiated: " + instance);
    }
    instance = this;
  }
}
