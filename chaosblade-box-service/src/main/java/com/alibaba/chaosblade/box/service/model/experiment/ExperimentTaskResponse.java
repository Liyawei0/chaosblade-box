/*
 * Copyright 1999-2021 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.chaosblade.box.service.model.experiment;

import com.alibaba.chaosblade.box.service.model.experiment.activity.ExperimentActivityTask;
import com.alibaba.chaosblade.box.service.model.experiment.activity.ExperimentActivityTaskRecord;
import com.alibaba.chaosblade.box.service.task.ActivityTask;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author yefei
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExperimentTaskResponse {

    private Long experimentId;

    private Long taskId;

    private String taskName;

    private Date startTime;

    private Date endTime;

    private Byte status;

    private Byte resultStatus;

    private String phase;

    private String error;

    private Long activityTaskId;

    private List<ExperimentActivityTask> activityTasks;

    private List<ExperimentActivityTaskRecord> activityTaskRecords;
}
