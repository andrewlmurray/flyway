/**
 * Copyright 2010-2014 Axel Fontaine
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.maven;

import org.flywaydb.core.Flyway;

/**
 * Baselines an existing database, excluding all migrations up to and including baselineVersion.
 *
 * @goal init
 * @deprecated Will be removed in Flyway 4.0. Use flyway:baseline instead.
 */
@SuppressWarnings({"UnusedDeclaration", "JavaDoc"})
@Deprecated
public class InitMojo extends AbstractFlywayMojo {
    @Override
    protected void doExecute(Flyway flyway) throws Exception {
        log.warn("flyway:init is deprecated and will be removed in Flyway 4.0. Use flyway:baseline instead.");
        flyway.baseline();
    }
}