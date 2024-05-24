// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowTriggerConfigTriggerPropertiesScheduled {
    /**
     * @return Whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow run. Valid values are `Incremental` and `Complete`.
     * 
     */
    private @Nullable String dataPullMode;
    /**
     * @return Date range for the records to import from the connector in the first flow run. Must be a valid RFC3339 timestamp.
     * 
     */
    private @Nullable String firstExecutionFrom;
    /**
     * @return Scheduled end time for a schedule-triggered flow. Must be a valid RFC3339 timestamp.
     * 
     */
    private @Nullable String scheduleEndTime;
    /**
     * @return Scheduling expression that determines the rate at which the schedule will run, for example `rate(5minutes)`.
     * 
     */
    private String scheduleExpression;
    /**
     * @return Optional offset that is added to the time interval for a schedule-triggered flow. Maximum value of 36000.
     * 
     */
    private @Nullable Integer scheduleOffset;
    /**
     * @return Scheduled start time for a schedule-triggered flow. Must be a valid RFC3339 timestamp.
     * 
     */
    private @Nullable String scheduleStartTime;
    /**
     * @return Time zone used when referring to the date and time of a scheduled-triggered flow, such as `America/New_York`.
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appflow.Flow;
     * import com.pulumi.aws.appflow.FlowArgs;
     * import com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var example = new Flow("example", FlowArgs.builder()
     *             .triggerConfig(FlowTriggerConfigArgs.builder()
     *                 .scheduled(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    private @Nullable String timezone;

    private FlowTriggerConfigTriggerPropertiesScheduled() {}
    /**
     * @return Whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow run. Valid values are `Incremental` and `Complete`.
     * 
     */
    public Optional<String> dataPullMode() {
        return Optional.ofNullable(this.dataPullMode);
    }
    /**
     * @return Date range for the records to import from the connector in the first flow run. Must be a valid RFC3339 timestamp.
     * 
     */
    public Optional<String> firstExecutionFrom() {
        return Optional.ofNullable(this.firstExecutionFrom);
    }
    /**
     * @return Scheduled end time for a schedule-triggered flow. Must be a valid RFC3339 timestamp.
     * 
     */
    public Optional<String> scheduleEndTime() {
        return Optional.ofNullable(this.scheduleEndTime);
    }
    /**
     * @return Scheduling expression that determines the rate at which the schedule will run, for example `rate(5minutes)`.
     * 
     */
    public String scheduleExpression() {
        return this.scheduleExpression;
    }
    /**
     * @return Optional offset that is added to the time interval for a schedule-triggered flow. Maximum value of 36000.
     * 
     */
    public Optional<Integer> scheduleOffset() {
        return Optional.ofNullable(this.scheduleOffset);
    }
    /**
     * @return Scheduled start time for a schedule-triggered flow. Must be a valid RFC3339 timestamp.
     * 
     */
    public Optional<String> scheduleStartTime() {
        return Optional.ofNullable(this.scheduleStartTime);
    }
    /**
     * @return Time zone used when referring to the date and time of a scheduled-triggered flow, such as `America/New_York`.
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appflow.Flow;
     * import com.pulumi.aws.appflow.FlowArgs;
     * import com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var example = new Flow("example", FlowArgs.builder()
     *             .triggerConfig(FlowTriggerConfigArgs.builder()
     *                 .scheduled(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public Optional<String> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTriggerConfigTriggerPropertiesScheduled defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dataPullMode;
        private @Nullable String firstExecutionFrom;
        private @Nullable String scheduleEndTime;
        private String scheduleExpression;
        private @Nullable Integer scheduleOffset;
        private @Nullable String scheduleStartTime;
        private @Nullable String timezone;
        public Builder() {}
        public Builder(FlowTriggerConfigTriggerPropertiesScheduled defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataPullMode = defaults.dataPullMode;
    	      this.firstExecutionFrom = defaults.firstExecutionFrom;
    	      this.scheduleEndTime = defaults.scheduleEndTime;
    	      this.scheduleExpression = defaults.scheduleExpression;
    	      this.scheduleOffset = defaults.scheduleOffset;
    	      this.scheduleStartTime = defaults.scheduleStartTime;
    	      this.timezone = defaults.timezone;
        }

        @CustomType.Setter
        public Builder dataPullMode(@Nullable String dataPullMode) {

            this.dataPullMode = dataPullMode;
            return this;
        }
        @CustomType.Setter
        public Builder firstExecutionFrom(@Nullable String firstExecutionFrom) {

            this.firstExecutionFrom = firstExecutionFrom;
            return this;
        }
        @CustomType.Setter
        public Builder scheduleEndTime(@Nullable String scheduleEndTime) {

            this.scheduleEndTime = scheduleEndTime;
            return this;
        }
        @CustomType.Setter
        public Builder scheduleExpression(String scheduleExpression) {
            if (scheduleExpression == null) {
              throw new MissingRequiredPropertyException("FlowTriggerConfigTriggerPropertiesScheduled", "scheduleExpression");
            }
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        @CustomType.Setter
        public Builder scheduleOffset(@Nullable Integer scheduleOffset) {

            this.scheduleOffset = scheduleOffset;
            return this;
        }
        @CustomType.Setter
        public Builder scheduleStartTime(@Nullable String scheduleStartTime) {

            this.scheduleStartTime = scheduleStartTime;
            return this;
        }
        @CustomType.Setter
        public Builder timezone(@Nullable String timezone) {

            this.timezone = timezone;
            return this;
        }
        public FlowTriggerConfigTriggerPropertiesScheduled build() {
            final var _resultValue = new FlowTriggerConfigTriggerPropertiesScheduled();
            _resultValue.dataPullMode = dataPullMode;
            _resultValue.firstExecutionFrom = firstExecutionFrom;
            _resultValue.scheduleEndTime = scheduleEndTime;
            _resultValue.scheduleExpression = scheduleExpression;
            _resultValue.scheduleOffset = scheduleOffset;
            _resultValue.scheduleStartTime = scheduleStartTime;
            _resultValue.timezone = timezone;
            return _resultValue;
        }
    }
}
