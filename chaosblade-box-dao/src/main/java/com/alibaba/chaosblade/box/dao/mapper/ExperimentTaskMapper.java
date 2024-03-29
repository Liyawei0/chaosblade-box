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

package com.alibaba.chaosblade.box.dao.mapper;

import com.alibaba.chaosblade.box.dao.model.ExperimentTaskDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yefei
 */
@Repository
public interface ExperimentTaskMapper extends BaseMapper<ExperimentTaskDO> {

    /**
     *
     */
    @Select("select count(*) as taskCount , max(date_format(gmt_start,'%Y-%m-%d')) as `date` from t_chaos_experiment_task group by date(gmt_start)")
    List<Map<Integer, Object>> queryTaskStatistics();

}
