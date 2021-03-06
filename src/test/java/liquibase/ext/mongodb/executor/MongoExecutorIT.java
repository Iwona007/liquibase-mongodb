package liquibase.ext.mongodb.executor;

/*-
 * #%L
 * Liquibase MongoDB Extension
 * %%
 * Copyright (C) 2019 Mastercard
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import liquibase.Scope;
import liquibase.executor.Executor;
import liquibase.executor.ExecutorService;
import liquibase.ext.AbstractMongoIntegrationTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;

class MongoExecutorIT extends AbstractMongoIntegrationTest {

    @Test
    void testGetInstance() {
        final Executor executor = Scope.getCurrentScope().getSingleton(ExecutorService.class).getExecutor(database);
        assertThat(executor, notNullValue());
        assertThat(executor, instanceOf(MongoExecutor.class));
    }

    @Test
    void setDatabase() {
    }

    @Test
    void queryForObject() {
    }

    @Test
    void queryForObject1() {
    }

    @Test
    void queryForLong() {
    }

    @Test
    void queryForLong1() {
    }

    @Test
    void queryForInt() {
    }

    @Test
    void queryForInt1() {
    }

    @Test
    void queryForList() {
    }

    @Test
    void queryForList1() {
    }

    @Test
    void queryForList2() {
    }

    @Test
    void queryForList3() {
    }

    @Test
    void execute() {
    }

    @Test
    void execute1() {
    }

    @Test
    void update() {
    }

    @Test
    void update1() {
    }

    @Test
    void comment() {
    }

    @Test
    void updatesDatabase() {
    }

    @Test
    void setDb() {
    }

    @Test
    void getDb() {
    }
}
