// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerDefaultActionForwardTargetGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionForwardTargetGroupArgs Empty = new ListenerDefaultActionForwardTargetGroupArgs();

    /**
     * ID or Amazon Resource Name (ARN) of the target group.
     * 
     */
    @Import(name="targetGroupIdentifier")
    private @Nullable Output<String> targetGroupIdentifier;

    /**
     * @return ID or Amazon Resource Name (ARN) of the target group.
     * 
     */
    public Optional<Output<String>> targetGroupIdentifier() {
        return Optional.ofNullable(this.targetGroupIdentifier);
    }

    /**
     * Determines how requests are distributed to the target group. Only required if you specify multiple target groups for a forward action. For example, if you specify two target groups, one with a
     * weight of 10 and the other with a weight of 20, the target group with a weight of 20 receives twice as many requests as the other target group. See [Listener rules](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules) in the AWS documentation for additional examples. Default: `100`.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Determines how requests are distributed to the target group. Only required if you specify multiple target groups for a forward action. For example, if you specify two target groups, one with a
     * weight of 10 and the other with a weight of 20, the target group with a weight of 20 receives twice as many requests as the other target group. See [Listener rules](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules) in the AWS documentation for additional examples. Default: `100`.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private ListenerDefaultActionForwardTargetGroupArgs() {}

    private ListenerDefaultActionForwardTargetGroupArgs(ListenerDefaultActionForwardTargetGroupArgs $) {
        this.targetGroupIdentifier = $.targetGroupIdentifier;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerDefaultActionForwardTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerDefaultActionForwardTargetGroupArgs $;

        public Builder() {
            $ = new ListenerDefaultActionForwardTargetGroupArgs();
        }

        public Builder(ListenerDefaultActionForwardTargetGroupArgs defaults) {
            $ = new ListenerDefaultActionForwardTargetGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetGroupIdentifier ID or Amazon Resource Name (ARN) of the target group.
         * 
         * @return builder
         * 
         */
        public Builder targetGroupIdentifier(@Nullable Output<String> targetGroupIdentifier) {
            $.targetGroupIdentifier = targetGroupIdentifier;
            return this;
        }

        /**
         * @param targetGroupIdentifier ID or Amazon Resource Name (ARN) of the target group.
         * 
         * @return builder
         * 
         */
        public Builder targetGroupIdentifier(String targetGroupIdentifier) {
            return targetGroupIdentifier(Output.of(targetGroupIdentifier));
        }

        /**
         * @param weight Determines how requests are distributed to the target group. Only required if you specify multiple target groups for a forward action. For example, if you specify two target groups, one with a
         * weight of 10 and the other with a weight of 20, the target group with a weight of 20 receives twice as many requests as the other target group. See [Listener rules](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules) in the AWS documentation for additional examples. Default: `100`.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Determines how requests are distributed to the target group. Only required if you specify multiple target groups for a forward action. For example, if you specify two target groups, one with a
         * weight of 10 and the other with a weight of 20, the target group with a weight of 20 receives twice as many requests as the other target group. See [Listener rules](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules) in the AWS documentation for additional examples. Default: `100`.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public ListenerDefaultActionForwardTargetGroupArgs build() {
            return $;
        }
    }

}
