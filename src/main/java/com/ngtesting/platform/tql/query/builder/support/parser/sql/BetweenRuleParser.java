/*
 * Copyright (c) 2017.
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

package com.ngtesting.platform.tql.query.builder.support.parser.sql;

import com.ngtesting.platform.tql.query.builder.support.model.IRule;
import com.ngtesting.platform.tql.query.builder.support.model.enums.EnumOperator;
import com.ngtesting.platform.tql.query.builder.support.model.sql.Operation;
import com.ngtesting.platform.tql.query.builder.support.parser.AbstractSqlRuleParser;
import com.ngtesting.platform.tql.query.builder.support.parser.JsonRuleParser;

/**
 * ---------------------------------------------------------------------------
 *
 * ---------------------------------------------------------------------------
 * @author: hewei
 * @time:2017/10/31 17:25
 * ---------------------------------------------------------------------------
 */
public class BetweenRuleParser extends AbstractSqlRuleParser {

    public boolean canParse(IRule rule) {
        return EnumOperator.BETWEEN.equals(rule.getOperator());
    }

    public Operation parse(IRule rule, JsonRuleParser parser) {
        return new Operation(new StringBuffer(rule.getField()).append(" BETWEEN ? AND ?"), rule.getValue());
    }
}
