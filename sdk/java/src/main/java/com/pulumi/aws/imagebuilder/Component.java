// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.imagebuilder.ComponentArgs;
import com.pulumi.aws.imagebuilder.inputs.ComponentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Image Builder Component.
 * 
 * ## Example Usage
 * ### URI Document
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.imagebuilder.Component;
 * import com.pulumi.aws.imagebuilder.ComponentArgs;
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
 *         var example = new Component(&#34;example&#34;, ComponentArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .platform(&#34;Linux&#34;)
 *             .uri(String.format(&#34;s3://%s/%s&#34;, exampleAwsS3Object.bucket(),exampleAwsS3Object.key()))
 *             .version(&#34;1.0.0&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_imagebuilder_components` resources using the Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 *  $ pulumi import aws:imagebuilder/component:Component example arn:aws:imagebuilder:us-east-1:123456789012:component/example/1.0.0/1
 * ```
 *  Certain resource arguments, such as `uri`, cannot be read via the API and imported into the provider. The provider will display a difference for these arguments the first run after import if declared in the the provider configuration for an imported resource.
 * 
 */
@ResourceType(type="aws:imagebuilder/component:Component")
public class Component extends com.pulumi.resources.CustomResource {
    /**
     * (Required) Amazon Resource Name (ARN) of the component.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return (Required) Amazon Resource Name (ARN) of the component.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Change description of the component.
     * 
     */
    @Export(name="changeDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> changeDescription;

    /**
     * @return Change description of the component.
     * 
     */
    public Output<Optional<String>> changeDescription() {
        return Codegen.optional(this.changeDescription);
    }
    /**
     * Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Export(name="data", refs={String.class}, tree="[0]")
    private Output<String> data;

    /**
     * @return Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Output<String> data() {
        return this.data;
    }
    /**
     * Date the component was created.
     * 
     */
    @Export(name="dateCreated", refs={String.class}, tree="[0]")
    private Output<String> dateCreated;

    /**
     * @return Date the component was created.
     * 
     */
    public Output<String> dateCreated() {
        return this.dateCreated;
    }
    /**
     * Description of the component.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the component.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Encryption status of the component.
     * 
     */
    @Export(name="encrypted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> encrypted;

    /**
     * @return Encryption status of the component.
     * 
     */
    public Output<Boolean> encrypted() {
        return this.encrypted;
    }
    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * Name of the component.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the component.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Owner of the component.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Owner of the component.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Platform of the component.
     * 
     */
    @Export(name="platform", refs={String.class}, tree="[0]")
    private Output<String> platform;

    /**
     * @return Platform of the component.
     * 
     */
    public Output<String> platform() {
        return this.platform;
    }
    /**
     * Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
     * 
     */
    @Export(name="skipDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipDestroy;

    /**
     * @return Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> skipDestroy() {
        return Codegen.optional(this.skipDestroy);
    }
    /**
     * Set of Operating Systems (OS) supported by the component.
     * 
     */
    @Export(name="supportedOsVersions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> supportedOsVersions;

    /**
     * @return Set of Operating Systems (OS) supported by the component.
     * 
     */
    public Output<Optional<List<String>>> supportedOsVersions() {
        return Codegen.optional(this.supportedOsVersions);
    }
    /**
     * Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Type of the component.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the component.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
     * 
     * &gt; **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
     * 
     */
    @Export(name="uri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> uri;

    /**
     * @return S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
     * 
     * &gt; **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
     * 
     */
    public Output<Optional<String>> uri() {
        return Codegen.optional(this.uri);
    }
    /**
     * Version of the component.
     * 
     * The following attributes are optional:
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return Version of the component.
     * 
     * The following attributes are optional:
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Component(String name) {
        this(name, ComponentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Component(String name, ComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Component(String name, ComponentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/component:Component", name, args == null ? ComponentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Component(String name, Output<String> id, @Nullable ComponentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/component:Component", name, state, makeResourceOptions(options, id));
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
    public static Component get(String name, Output<String> id, @Nullable ComponentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Component(name, id, state, options);
    }
}
