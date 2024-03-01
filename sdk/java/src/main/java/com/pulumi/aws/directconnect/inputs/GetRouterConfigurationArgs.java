// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRouterConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouterConfigurationArgs Empty = new GetRouterConfigurationArgs();

    /**
     * ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
     * 
     * There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:
     * 
     */
    @Import(name="routerTypeIdentifier", required=true)
    private Output<String> routerTypeIdentifier;

    /**
     * @return ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
     * 
     * There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:
     * 
     */
    public Output<String> routerTypeIdentifier() {
        return this.routerTypeIdentifier;
    }

    /**
     * ID of the Direct Connect Virtual Interface
     * 
     */
    @Import(name="virtualInterfaceId", required=true)
    private Output<String> virtualInterfaceId;

    /**
     * @return ID of the Direct Connect Virtual Interface
     * 
     */
    public Output<String> virtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    private GetRouterConfigurationArgs() {}

    private GetRouterConfigurationArgs(GetRouterConfigurationArgs $) {
        this.routerTypeIdentifier = $.routerTypeIdentifier;
        this.virtualInterfaceId = $.virtualInterfaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouterConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouterConfigurationArgs $;

        public Builder() {
            $ = new GetRouterConfigurationArgs();
        }

        public Builder(GetRouterConfigurationArgs defaults) {
            $ = new GetRouterConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routerTypeIdentifier ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
         * 
         * There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:
         * 
         * @return builder
         * 
         */
        public Builder routerTypeIdentifier(Output<String> routerTypeIdentifier) {
            $.routerTypeIdentifier = routerTypeIdentifier;
            return this;
        }

        /**
         * @param routerTypeIdentifier ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
         * 
         * There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:
         * 
         * @return builder
         * 
         */
        public Builder routerTypeIdentifier(String routerTypeIdentifier) {
            return routerTypeIdentifier(Output.of(routerTypeIdentifier));
        }

        /**
         * @param virtualInterfaceId ID of the Direct Connect Virtual Interface
         * 
         * @return builder
         * 
         */
        public Builder virtualInterfaceId(Output<String> virtualInterfaceId) {
            $.virtualInterfaceId = virtualInterfaceId;
            return this;
        }

        /**
         * @param virtualInterfaceId ID of the Direct Connect Virtual Interface
         * 
         * @return builder
         * 
         */
        public Builder virtualInterfaceId(String virtualInterfaceId) {
            return virtualInterfaceId(Output.of(virtualInterfaceId));
        }

        public GetRouterConfigurationArgs build() {
            if ($.routerTypeIdentifier == null) {
                throw new MissingRequiredPropertyException("GetRouterConfigurationArgs", "routerTypeIdentifier");
            }
            if ($.virtualInterfaceId == null) {
                throw new MissingRequiredPropertyException("GetRouterConfigurationArgs", "virtualInterfaceId");
            }
            return $;
        }
    }

}
