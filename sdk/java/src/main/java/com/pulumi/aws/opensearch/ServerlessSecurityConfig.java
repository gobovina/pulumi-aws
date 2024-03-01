// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearch.ServerlessSecurityConfigArgs;
import com.pulumi.aws.opensearch.inputs.ServerlessSecurityConfigState;
import com.pulumi.aws.opensearch.outputs.ServerlessSecurityConfigSamlOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS OpenSearch Serverless Security Config.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Using `pulumi import`, import OpenSearchServerless Access Policy using the `name` argument prefixed with the string `saml/account_id/`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:opensearch/serverlessSecurityConfig:ServerlessSecurityConfig example saml/123456789012/example
 * ```
 * 
 */
@ResourceType(type="aws:opensearch/serverlessSecurityConfig:ServerlessSecurityConfig")
public class ServerlessSecurityConfig extends com.pulumi.resources.CustomResource {
    /**
     * Version of the configuration.
     * 
     */
    @Export(name="configVersion", refs={String.class}, tree="[0]")
    private Output<String> configVersion;

    /**
     * @return Version of the configuration.
     * 
     */
    public Output<String> configVersion() {
        return this.configVersion;
    }
    /**
     * Description of the security configuration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the security configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration block for SAML options.
     * 
     */
    @Export(name="samlOptions", refs={ServerlessSecurityConfigSamlOptions.class}, tree="[0]")
    private Output</* @Nullable */ ServerlessSecurityConfigSamlOptions> samlOptions;

    /**
     * @return Configuration block for SAML options.
     * 
     */
    public Output<Optional<ServerlessSecurityConfigSamlOptions>> samlOptions() {
        return Codegen.optional(this.samlOptions);
    }
    /**
     * Type of configuration. Must be `saml`.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of configuration. Must be `saml`.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerlessSecurityConfig(String name) {
        this(name, ServerlessSecurityConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerlessSecurityConfig(String name, ServerlessSecurityConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerlessSecurityConfig(String name, ServerlessSecurityConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessSecurityConfig:ServerlessSecurityConfig", name, args == null ? ServerlessSecurityConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerlessSecurityConfig(String name, Output<String> id, @Nullable ServerlessSecurityConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessSecurityConfig:ServerlessSecurityConfig", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServerlessSecurityConfig get(String name, Output<String> id, @Nullable ServerlessSecurityConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerlessSecurityConfig(name, id, state, options);
    }
}
