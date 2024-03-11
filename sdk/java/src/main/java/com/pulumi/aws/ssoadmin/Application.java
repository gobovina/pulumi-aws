// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssoadmin.ApplicationArgs;
import com.pulumi.aws.ssoadmin.inputs.ApplicationState;
import com.pulumi.aws.ssoadmin.outputs.ApplicationPortalOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS SSO Admin Application.
 * 
 * &gt; The `CreateApplication` API only supports custom OAuth 2.0 applications.
 * Creation of 3rd party SAML or OAuth 2.0 applications require setup to be done through the associated app service or AWS console.
 * See this issue for additional context.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SSO Admin Application using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ssoadmin/application:Application example arn:aws:sso::012345678901:application/id-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ssoadmin/application:Application")
public class Application extends com.pulumi.resources.CustomResource {
    /**
     * AWS account ID.
     * 
     */
    @Export(name="applicationAccount", refs={String.class}, tree="[0]")
    private Output<String> applicationAccount;

    /**
     * @return AWS account ID.
     * 
     */
    public Output<String> applicationAccount() {
        return this.applicationAccount;
    }
    /**
     * ARN of the application.
     * 
     */
    @Export(name="applicationArn", refs={String.class}, tree="[0]")
    private Output<String> applicationArn;

    /**
     * @return ARN of the application.
     * 
     */
    public Output<String> applicationArn() {
        return this.applicationArn;
    }
    /**
     * ARN of the application provider.
     * 
     */
    @Export(name="applicationProviderArn", refs={String.class}, tree="[0]")
    private Output<String> applicationProviderArn;

    /**
     * @return ARN of the application provider.
     * 
     */
    public Output<String> applicationProviderArn() {
        return this.applicationProviderArn;
    }
    /**
     * A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
     * 
     */
    @Export(name="clientToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientToken;

    /**
     * @return A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
     * 
     */
    public Output<Optional<String>> clientToken() {
        return Codegen.optional(this.clientToken);
    }
    /**
     * Description of the application.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the application.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * ARN of the instance of IAM Identity Center.
     * 
     */
    @Export(name="instanceArn", refs={String.class}, tree="[0]")
    private Output<String> instanceArn;

    /**
     * @return ARN of the instance of IAM Identity Center.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }
    /**
     * Name of the application.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the application.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Options for the portal associated with an application. See `portal_options` below.
     * 
     */
    @Export(name="portalOptions", refs={ApplicationPortalOptions.class}, tree="[0]")
    private Output</* @Nullable */ ApplicationPortalOptions> portalOptions;

    /**
     * @return Options for the portal associated with an application. See `portal_options` below.
     * 
     */
    public Output<Optional<ApplicationPortalOptions>> portalOptions() {
        return Codegen.optional(this.portalOptions);
    }
    /**
     * Status of the application. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the application. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/application:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/application:Application", name, state, makeResourceOptions(options, id));
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
    public static Application get(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, state, options);
    }
}
