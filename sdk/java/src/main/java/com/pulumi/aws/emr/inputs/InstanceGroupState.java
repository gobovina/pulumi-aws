// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.aws.emr.inputs.InstanceGroupEbsConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupState Empty = new InstanceGroupState();

    /**
     * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
     * 
     */
    @Import(name="autoscalingPolicy")
    private @Nullable Output<String> autoscalingPolicy;

    /**
     * @return The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
     * 
     */
    public Optional<Output<String>> autoscalingPolicy() {
        return Optional.ofNullable(this.autoscalingPolicy);
    }

    /**
     * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    @Import(name="bidPrice")
    private @Nullable Output<String> bidPrice;

    /**
     * @return If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    public Optional<Output<String>> bidPrice() {
        return Optional.ofNullable(this.bidPrice);
    }

    /**
     * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.InstanceGroup;
     * import com.pulumi.aws.emr.InstanceGroupArgs;
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
     *         var task = new InstanceGroup(&#34;task&#34;, InstanceGroupArgs.builder()        
     *             .configurationsJson(&#34;&#34;&#34;
     * [
     * {
     * &#34;Classification&#34;: &#34;hadoop-env&#34;,
     * &#34;Configurations&#34;: [
     * {
     * &#34;Classification&#34;: &#34;export&#34;,
     * &#34;Properties&#34;: {
     * &#34;JAVA_HOME&#34;: &#34;/usr/lib/jvm/java-1.8.0&#34;
     * }
     * }
     * ],
     * &#34;Properties&#34;: {}
     * }
     * ]
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    @Import(name="configurationsJson")
    private @Nullable Output<String> configurationsJson;

    /**
     * @return A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.InstanceGroup;
     * import com.pulumi.aws.emr.InstanceGroupArgs;
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
     *         var task = new InstanceGroup(&#34;task&#34;, InstanceGroupArgs.builder()        
     *             .configurationsJson(&#34;&#34;&#34;
     * [
     * {
     * &#34;Classification&#34;: &#34;hadoop-env&#34;,
     * &#34;Configurations&#34;: [
     * {
     * &#34;Classification&#34;: &#34;export&#34;,
     * &#34;Properties&#34;: {
     * &#34;JAVA_HOME&#34;: &#34;/usr/lib/jvm/java-1.8.0&#34;
     * }
     * }
     * ],
     * &#34;Properties&#34;: {}
     * }
     * ]
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public Optional<Output<String>> configurationsJson() {
        return Optional.ofNullable(this.configurationsJson);
    }

    /**
     * One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="ebsConfigs")
    private @Nullable Output<List<InstanceGroupEbsConfigArgs>> ebsConfigs;

    /**
     * @return One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<InstanceGroupEbsConfigArgs>>> ebsConfigs() {
        return Optional.ofNullable(this.ebsConfigs);
    }

    /**
     * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="ebsOptimized")
    private @Nullable Output<Boolean> ebsOptimized;

    /**
     * @return Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> ebsOptimized() {
        return Optional.ofNullable(this.ebsOptimized);
    }

    /**
     * target number of instances for the instance group. defaults to 0.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return target number of instances for the instance group. defaults to 0.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Human friendly name given to the instance group. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Human friendly name given to the instance group. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The number of instances currently running in this instance group.
     * 
     */
    @Import(name="runningInstanceCount")
    private @Nullable Output<Integer> runningInstanceCount;

    /**
     * @return The number of instances currently running in this instance group.
     * 
     */
    public Optional<Output<Integer>> runningInstanceCount() {
        return Optional.ofNullable(this.runningInstanceCount);
    }

    /**
     * The current status of the instance group.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The current status of the instance group.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private InstanceGroupState() {}

    private InstanceGroupState(InstanceGroupState $) {
        this.autoscalingPolicy = $.autoscalingPolicy;
        this.bidPrice = $.bidPrice;
        this.clusterId = $.clusterId;
        this.configurationsJson = $.configurationsJson;
        this.ebsConfigs = $.ebsConfigs;
        this.ebsOptimized = $.ebsOptimized;
        this.instanceCount = $.instanceCount;
        this.instanceType = $.instanceType;
        this.name = $.name;
        this.runningInstanceCount = $.runningInstanceCount;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupState $;

        public Builder() {
            $ = new InstanceGroupState();
        }

        public Builder(InstanceGroupState defaults) {
            $ = new InstanceGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalingPolicy The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
         * 
         * @return builder
         * 
         */
        public Builder autoscalingPolicy(@Nullable Output<String> autoscalingPolicy) {
            $.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        /**
         * @param autoscalingPolicy The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
         * 
         * @return builder
         * 
         */
        public Builder autoscalingPolicy(String autoscalingPolicy) {
            return autoscalingPolicy(Output.of(autoscalingPolicy));
        }

        /**
         * @param bidPrice If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
         * 
         * @return builder
         * 
         */
        public Builder bidPrice(@Nullable Output<String> bidPrice) {
            $.bidPrice = bidPrice;
            return this;
        }

        /**
         * @param bidPrice If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
         * 
         * @return builder
         * 
         */
        public Builder bidPrice(String bidPrice) {
            return bidPrice(Output.of(bidPrice));
        }

        /**
         * @param clusterId ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param configurationsJson A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.aws.emr.InstanceGroup;
         * import com.pulumi.aws.emr.InstanceGroupArgs;
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
         *         var task = new InstanceGroup(&#34;task&#34;, InstanceGroupArgs.builder()        
         *             .configurationsJson(&#34;&#34;&#34;
         * [
         * {
         * &#34;Classification&#34;: &#34;hadoop-env&#34;,
         * &#34;Configurations&#34;: [
         * {
         * &#34;Classification&#34;: &#34;export&#34;,
         * &#34;Properties&#34;: {
         * &#34;JAVA_HOME&#34;: &#34;/usr/lib/jvm/java-1.8.0&#34;
         * }
         * }
         * ],
         * &#34;Properties&#34;: {}
         * }
         * ]
         *             &#34;&#34;&#34;)
         *             .build());
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder configurationsJson(@Nullable Output<String> configurationsJson) {
            $.configurationsJson = configurationsJson;
            return this;
        }

        /**
         * @param configurationsJson A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.aws.emr.InstanceGroup;
         * import com.pulumi.aws.emr.InstanceGroupArgs;
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
         *         var task = new InstanceGroup(&#34;task&#34;, InstanceGroupArgs.builder()        
         *             .configurationsJson(&#34;&#34;&#34;
         * [
         * {
         * &#34;Classification&#34;: &#34;hadoop-env&#34;,
         * &#34;Configurations&#34;: [
         * {
         * &#34;Classification&#34;: &#34;export&#34;,
         * &#34;Properties&#34;: {
         * &#34;JAVA_HOME&#34;: &#34;/usr/lib/jvm/java-1.8.0&#34;
         * }
         * }
         * ],
         * &#34;Properties&#34;: {}
         * }
         * ]
         *             &#34;&#34;&#34;)
         *             .build());
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder configurationsJson(String configurationsJson) {
            return configurationsJson(Output.of(configurationsJson));
        }

        /**
         * @param ebsConfigs One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ebsConfigs(@Nullable Output<List<InstanceGroupEbsConfigArgs>> ebsConfigs) {
            $.ebsConfigs = ebsConfigs;
            return this;
        }

        /**
         * @param ebsConfigs One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ebsConfigs(List<InstanceGroupEbsConfigArgs> ebsConfigs) {
            return ebsConfigs(Output.of(ebsConfigs));
        }

        /**
         * @param ebsConfigs One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ebsConfigs(InstanceGroupEbsConfigArgs... ebsConfigs) {
            return ebsConfigs(List.of(ebsConfigs));
        }

        /**
         * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ebsOptimized(@Nullable Output<Boolean> ebsOptimized) {
            $.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ebsOptimized(Boolean ebsOptimized) {
            return ebsOptimized(Output.of(ebsOptimized));
        }

        /**
         * @param instanceCount target number of instances for the instance group. defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount target number of instances for the instance group. defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param instanceType The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param name Human friendly name given to the instance group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human friendly name given to the instance group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runningInstanceCount The number of instances currently running in this instance group.
         * 
         * @return builder
         * 
         */
        public Builder runningInstanceCount(@Nullable Output<Integer> runningInstanceCount) {
            $.runningInstanceCount = runningInstanceCount;
            return this;
        }

        /**
         * @param runningInstanceCount The number of instances currently running in this instance group.
         * 
         * @return builder
         * 
         */
        public Builder runningInstanceCount(Integer runningInstanceCount) {
            return runningInstanceCount(Output.of(runningInstanceCount));
        }

        /**
         * @param status The current status of the instance group.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The current status of the instance group.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public InstanceGroupState build() {
            return $;
        }
    }

}
