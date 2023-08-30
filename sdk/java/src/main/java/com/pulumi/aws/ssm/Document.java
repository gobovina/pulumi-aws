// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.DocumentArgs;
import com.pulumi.aws.ssm.inputs.DocumentState;
import com.pulumi.aws.ssm.outputs.DocumentAttachmentsSource;
import com.pulumi.aws.ssm.outputs.DocumentParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an SSM Document resource
 * 
 * &gt; **NOTE on updating SSM documents:** Only documents with a schema version of 2.0
 * or greater can update their content once created, see [SSM Schema Features](http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html#document-schemas-features). To update a document with an older schema version you must recreate the resource. Not all document types support a schema version of 2.0 or greater. Refer to [SSM document schema features and examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html) for information about which schema versions are supported for the respective `document_type`.
 * 
 * ## Example Usage
 * ### Create an ssm document in JSON format
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssm.Document;
 * import com.pulumi.aws.ssm.DocumentArgs;
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
 *         var foo = new Document(&#34;foo&#34;, DocumentArgs.builder()        
 *             .content(&#34;&#34;&#34;
 *   {
 *     &#34;schemaVersion&#34;: &#34;1.2&#34;,
 *     &#34;description&#34;: &#34;Check ip configuration of a Linux instance.&#34;,
 *     &#34;parameters&#34;: {
 * 
 *     },
 *     &#34;runtimeConfig&#34;: {
 *       &#34;aws:runShellScript&#34;: {
 *         &#34;properties&#34;: [
 *           {
 *             &#34;id&#34;: &#34;0.aws:runShellScript&#34;,
 *             &#34;runCommand&#34;: [&#34;ifconfig&#34;]
 *           }
 *         ]
 *       }
 *     }
 *   }
 * 
 *             &#34;&#34;&#34;)
 *             .documentType(&#34;Command&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create an ssm document in YAML format
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssm.Document;
 * import com.pulumi.aws.ssm.DocumentArgs;
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
 *         var foo = new Document(&#34;foo&#34;, DocumentArgs.builder()        
 *             .content(&#34;&#34;&#34;
 * schemaVersion: &#39;1.2&#39;
 * description: Check ip configuration of a Linux instance.
 * parameters: {}
 * runtimeConfig:
 *   &#39;aws:runShellScript&#39;:
 *     properties:
 *       - id: &#39;0.aws:runShellScript&#39;
 *         runCommand:
 *           - ifconfig
 * 
 *             &#34;&#34;&#34;)
 *             .documentFormat(&#34;YAML&#34;)
 *             .documentType(&#34;Command&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Permissions
 * 
 * The permissions attribute specifies how you want to share the document. If you share a document privately,
 * you must specify the AWS user account IDs for those people who can use the document. If you share a document
 * publicly, you must specify All as the account ID.
 * 
 * The permissions mapping supports the following:
 * 
 * * `type` - The permission type for the document. The permission type can be `Share`.
 * * `account_ids` - The AWS user accounts that should have access to the document. The account IDs can either be a group of account IDs or `All`.
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SSM Documents using the name. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ssm/document:Document example example
 * ```
 *  The `attachments_source` argument does not have an SSM API method for reading the attachment information detail after creation. If the argument is set in the TODO configuration on an imported resource, TODO will always show a difference. To workaround this behavior, either omit the argument from the TODO configuration or use `ignore_changes` to hide the difference. For example:
 * 
 */
@ResourceType(type="aws:ssm/document:Document")
public class Document extends com.pulumi.resources.CustomResource {
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
     * 
     */
    @Export(name="attachmentsSources", refs={List.class,DocumentAttachmentsSource.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DocumentAttachmentsSource>> attachmentsSources;

    /**
     * @return One or more configuration blocks describing attachments sources to a version of a document. Defined below.
     * 
     */
    public Output<Optional<List<DocumentAttachmentsSource>>> attachmentsSources() {
        return Codegen.optional(this.attachmentsSources);
    }
    /**
     * The JSON or YAML content of the document.
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output<String> content;

    /**
     * @return The JSON or YAML content of the document.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * The date the document was created.
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return The date the document was created.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * The default version of the document.
     * 
     */
    @Export(name="defaultVersion", refs={String.class}, tree="[0]")
    private Output<String> defaultVersion;

    /**
     * @return The default version of the document.
     * 
     */
    public Output<String> defaultVersion() {
        return this.defaultVersion;
    }
    /**
     * The description of the document.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the document.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The format of the document. Valid document types include: `JSON` and `YAML`
     * 
     */
    @Export(name="documentFormat", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> documentFormat;

    /**
     * @return The format of the document. Valid document types include: `JSON` and `YAML`
     * 
     */
    public Output<Optional<String>> documentFormat() {
        return Codegen.optional(this.documentFormat);
    }
    /**
     * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
     * 
     */
    @Export(name="documentType", refs={String.class}, tree="[0]")
    private Output<String> documentType;

    /**
     * @return The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
     * 
     */
    public Output<String> documentType() {
        return this.documentType;
    }
    /**
     * The document version.
     * 
     */
    @Export(name="documentVersion", refs={String.class}, tree="[0]")
    private Output<String> documentVersion;

    /**
     * @return The document version.
     * 
     */
    public Output<String> documentVersion() {
        return this.documentVersion;
    }
    /**
     * The sha1 or sha256 of the document content
     * 
     */
    @Export(name="hash", refs={String.class}, tree="[0]")
    private Output<String> hash;

    /**
     * @return The sha1 or sha256 of the document content
     * 
     */
    public Output<String> hash() {
        return this.hash;
    }
    /**
     * &#34;Sha1&#34; &#34;Sha256&#34;. The hashing algorithm used when hashing the content.
     * 
     */
    @Export(name="hashType", refs={String.class}, tree="[0]")
    private Output<String> hashType;

    /**
     * @return &#34;Sha1&#34; &#34;Sha256&#34;. The hashing algorithm used when hashing the content.
     * 
     */
    public Output<String> hashType() {
        return this.hashType;
    }
    /**
     * The latest version of the document.
     * 
     */
    @Export(name="latestVersion", refs={String.class}, tree="[0]")
    private Output<String> latestVersion;

    /**
     * @return The latest version of the document.
     * 
     */
    public Output<String> latestVersion() {
        return this.latestVersion;
    }
    /**
     * The name of the document.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the document.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The AWS user account of the person who created the document.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return The AWS user account of the person who created the document.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The parameters that are available to this document.
     * 
     */
    @Export(name="parameters", refs={List.class,DocumentParameter.class}, tree="[0,1]")
    private Output<List<DocumentParameter>> parameters;

    /**
     * @return The parameters that are available to this document.
     * 
     */
    public Output<List<DocumentParameter>> parameters() {
        return this.parameters;
    }
    /**
     * Additional Permissions to attach to the document. See Permissions below for details.
     * 
     */
    @Export(name="permissions", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> permissions;

    /**
     * @return Additional Permissions to attach to the document. See Permissions below for details.
     * 
     */
    public Output<Optional<Map<String,String>>> permissions() {
        return Codegen.optional(this.permissions);
    }
    /**
     * A list of OS platforms compatible with this SSM document, either &#34;Windows&#34; or &#34;Linux&#34;.
     * 
     */
    @Export(name="platformTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> platformTypes;

    /**
     * @return A list of OS platforms compatible with this SSM document, either &#34;Windows&#34; or &#34;Linux&#34;.
     * 
     */
    public Output<List<String>> platformTypes() {
        return this.platformTypes;
    }
    /**
     * The schema version of the document.
     * 
     */
    @Export(name="schemaVersion", refs={String.class}, tree="[0]")
    private Output<String> schemaVersion;

    /**
     * @return The schema version of the document.
     * 
     */
    public Output<String> schemaVersion() {
        return this.schemaVersion;
    }
    /**
     * &#34;Creating&#34;, &#34;Active&#34; or &#34;Deleting&#34;. The current status of the document.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return &#34;Creating&#34;, &#34;Active&#34; or &#34;Deleting&#34;. The current status of the document.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * 
     */
    @Export(name="targetType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> targetType;

    /**
     * @return The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * 
     */
    public Output<Optional<String>> targetType() {
        return Codegen.optional(this.targetType);
    }
    /**
     * A field specifying the version of the artifact you are creating with the document. For example, &#34;Release 12, Update 6&#34;. This value is unique across all versions of a document and cannot be changed for an existing document version.
     * 
     */
    @Export(name="versionName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> versionName;

    /**
     * @return A field specifying the version of the artifact you are creating with the document. For example, &#34;Release 12, Update 6&#34;. This value is unique across all versions of a document and cannot be changed for an existing document version.
     * 
     */
    public Output<Optional<String>> versionName() {
        return Codegen.optional(this.versionName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Document(String name) {
        this(name, DocumentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Document(String name, DocumentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Document(String name, DocumentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/document:Document", name, args == null ? DocumentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Document(String name, Output<String> id, @Nullable DocumentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/document:Document", name, state, makeResourceOptions(options, id));
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
    public static Document get(String name, Output<String> id, @Nullable DocumentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Document(name, id, state, options);
    }
}
