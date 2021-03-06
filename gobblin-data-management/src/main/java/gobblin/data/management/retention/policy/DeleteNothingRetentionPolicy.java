/*
* Copyright (C) 2014-2016 LinkedIn Corp. All rights reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not use
* this file except in compliance with the License. You may obtain a copy of the
* License at  http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software distributed
* under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
* CONDITIONS OF ANY KIND, either express or implied.
*/
package gobblin.data.management.retention.policy;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

import com.google.common.collect.Lists;
import com.typesafe.config.Config;

import gobblin.data.management.retention.version.DatasetVersion;


/**
 * A {@link RetentionPolicy} that does not delete any versions. Basically a pass through dummy policy.
 */
public class DeleteNothingRetentionPolicy implements RetentionPolicy<DatasetVersion> {

  public DeleteNothingRetentionPolicy(Properties properties) {}

  public DeleteNothingRetentionPolicy(Config conf) {}

  @Override
  public Class<? extends DatasetVersion> versionClass() {
    return DatasetVersion.class;
  }

  @Override
  public Collection<DatasetVersion> listDeletableVersions(List<DatasetVersion> allVersions) {
    return Lists.newArrayList();
  }
}
