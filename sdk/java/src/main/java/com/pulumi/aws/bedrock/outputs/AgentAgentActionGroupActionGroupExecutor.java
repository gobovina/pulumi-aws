// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AgentAgentActionGroupActionGroupExecutor {
    /**
     * @return ARN of the Lambda function containing the business logic that is carried out upon invoking the action.
     * 
     */
    private @Nullable String lambda;

    private AgentAgentActionGroupActionGroupExecutor() {}
    /**
     * @return ARN of the Lambda function containing the business logic that is carried out upon invoking the action.
     * 
     */
    public Optional<String> lambda() {
        return Optional.ofNullable(this.lambda);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentAgentActionGroupActionGroupExecutor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String lambda;
        public Builder() {}
        public Builder(AgentAgentActionGroupActionGroupExecutor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambda = defaults.lambda;
        }

        @CustomType.Setter
        public Builder lambda(@Nullable String lambda) {

            this.lambda = lambda;
            return this;
        }
        public AgentAgentActionGroupActionGroupExecutor build() {
            final var _resultValue = new AgentAgentActionGroupActionGroupExecutor();
            _resultValue.lambda = lambda;
            return _resultValue;
        }
    }
}
