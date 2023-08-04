// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sfn;

import com.pulumi.aws.sfn.inputs.AliasRoutingConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * Description of the alias.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the alias.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name for the alias you are creating.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name for the alias you are creating.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The StateMachine alias&#39; route configuration settings. Fields documented below
     * 
     */
    @Import(name="routingConfigurations", required=true)
    private Output<List<AliasRoutingConfigurationArgs>> routingConfigurations;

    /**
     * @return The StateMachine alias&#39; route configuration settings. Fields documented below
     * 
     */
    public Output<List<AliasRoutingConfigurationArgs>> routingConfigurations() {
        return this.routingConfigurations;
    }

    private AliasArgs() {}

    private AliasArgs(AliasArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.routingConfigurations = $.routingConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasArgs $;

        public Builder() {
            $ = new AliasArgs();
        }

        public Builder(AliasArgs defaults) {
            $ = new AliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the alias.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the alias.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name for the alias you are creating.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for the alias you are creating.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routingConfigurations The StateMachine alias&#39; route configuration settings. Fields documented below
         * 
         * @return builder
         * 
         */
        public Builder routingConfigurations(Output<List<AliasRoutingConfigurationArgs>> routingConfigurations) {
            $.routingConfigurations = routingConfigurations;
            return this;
        }

        /**
         * @param routingConfigurations The StateMachine alias&#39; route configuration settings. Fields documented below
         * 
         * @return builder
         * 
         */
        public Builder routingConfigurations(List<AliasRoutingConfigurationArgs> routingConfigurations) {
            return routingConfigurations(Output.of(routingConfigurations));
        }

        /**
         * @param routingConfigurations The StateMachine alias&#39; route configuration settings. Fields documented below
         * 
         * @return builder
         * 
         */
        public Builder routingConfigurations(AliasRoutingConfigurationArgs... routingConfigurations) {
            return routingConfigurations(List.of(routingConfigurations));
        }

        public AliasArgs build() {
            $.routingConfigurations = Objects.requireNonNull($.routingConfigurations, "expected parameter 'routingConfigurations' to be non-null");
            return $;
        }
    }

}
