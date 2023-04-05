// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentArgs Empty = new DocumentArgs();

    /**
     * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
     * 
     */
    @Import(name="attachmentsSources")
    private @Nullable Output<List<DocumentAttachmentsSourceArgs>> attachmentsSources;

    /**
     * @return One or more configuration blocks describing attachments sources to a version of a document. Defined below.
     * 
     */
    public Optional<Output<List<DocumentAttachmentsSourceArgs>>> attachmentsSources() {
        return Optional.ofNullable(this.attachmentsSources);
    }

    /**
     * The JSON or YAML content of the document.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return The JSON or YAML content of the document.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * The format of the document. Valid document types include: `JSON` and `YAML`
     * 
     */
    @Import(name="documentFormat")
    private @Nullable Output<String> documentFormat;

    /**
     * @return The format of the document. Valid document types include: `JSON` and `YAML`
     * 
     */
    public Optional<Output<String>> documentFormat() {
        return Optional.ofNullable(this.documentFormat);
    }

    /**
     * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
     * 
     */
    @Import(name="documentType", required=true)
    private Output<String> documentType;

    /**
     * @return The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
     * 
     */
    public Output<String> documentType() {
        return this.documentType;
    }

    /**
     * The name of the document.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the document.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Additional Permissions to attach to the document. See Permissions below for details.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<Map<String,String>> permissions;

    /**
     * @return Additional Permissions to attach to the document. See Permissions below for details.
     * 
     */
    public Optional<Output<Map<String,String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * 
     */
    @Import(name="targetType")
    private @Nullable Output<String> targetType;

    /**
     * @return The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * 
     */
    public Optional<Output<String>> targetType() {
        return Optional.ofNullable(this.targetType);
    }

    /**
     * A field specifying the version of the artifact you are creating with the document. For example, &#34;Release 12, Update 6&#34;. This value is unique across all versions of a document and cannot be changed for an existing document version.
     * 
     */
    @Import(name="versionName")
    private @Nullable Output<String> versionName;

    /**
     * @return A field specifying the version of the artifact you are creating with the document. For example, &#34;Release 12, Update 6&#34;. This value is unique across all versions of a document and cannot be changed for an existing document version.
     * 
     */
    public Optional<Output<String>> versionName() {
        return Optional.ofNullable(this.versionName);
    }

    private DocumentArgs() {}

    private DocumentArgs(DocumentArgs $) {
        this.attachmentsSources = $.attachmentsSources;
        this.content = $.content;
        this.documentFormat = $.documentFormat;
        this.documentType = $.documentType;
        this.name = $.name;
        this.permissions = $.permissions;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.targetType = $.targetType;
        this.versionName = $.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentArgs $;

        public Builder() {
            $ = new DocumentArgs();
        }

        public Builder(DocumentArgs defaults) {
            $ = new DocumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachmentsSources One or more configuration blocks describing attachments sources to a version of a document. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder attachmentsSources(@Nullable Output<List<DocumentAttachmentsSourceArgs>> attachmentsSources) {
            $.attachmentsSources = attachmentsSources;
            return this;
        }

        /**
         * @param attachmentsSources One or more configuration blocks describing attachments sources to a version of a document. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder attachmentsSources(List<DocumentAttachmentsSourceArgs> attachmentsSources) {
            return attachmentsSources(Output.of(attachmentsSources));
        }

        /**
         * @param attachmentsSources One or more configuration blocks describing attachments sources to a version of a document. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder attachmentsSources(DocumentAttachmentsSourceArgs... attachmentsSources) {
            return attachmentsSources(List.of(attachmentsSources));
        }

        /**
         * @param content The JSON or YAML content of the document.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The JSON or YAML content of the document.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param documentFormat The format of the document. Valid document types include: `JSON` and `YAML`
         * 
         * @return builder
         * 
         */
        public Builder documentFormat(@Nullable Output<String> documentFormat) {
            $.documentFormat = documentFormat;
            return this;
        }

        /**
         * @param documentFormat The format of the document. Valid document types include: `JSON` and `YAML`
         * 
         * @return builder
         * 
         */
        public Builder documentFormat(String documentFormat) {
            return documentFormat(Output.of(documentFormat));
        }

        /**
         * @param documentType The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
         * 
         * @return builder
         * 
         */
        public Builder documentType(Output<String> documentType) {
            $.documentType = documentType;
            return this;
        }

        /**
         * @param documentType The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
         * 
         * @return builder
         * 
         */
        public Builder documentType(String documentType) {
            return documentType(Output.of(documentType));
        }

        /**
         * @param name The name of the document.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the document.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param permissions Additional Permissions to attach to the document. See Permissions below for details.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<Map<String,String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Additional Permissions to attach to the document. See Permissions below for details.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Map<String,String> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param tags A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param targetType The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
         * 
         * @return builder
         * 
         */
        public Builder targetType(@Nullable Output<String> targetType) {
            $.targetType = targetType;
            return this;
        }

        /**
         * @param targetType The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
         * 
         * @return builder
         * 
         */
        public Builder targetType(String targetType) {
            return targetType(Output.of(targetType));
        }

        /**
         * @param versionName A field specifying the version of the artifact you are creating with the document. For example, &#34;Release 12, Update 6&#34;. This value is unique across all versions of a document and cannot be changed for an existing document version.
         * 
         * @return builder
         * 
         */
        public Builder versionName(@Nullable Output<String> versionName) {
            $.versionName = versionName;
            return this;
        }

        /**
         * @param versionName A field specifying the version of the artifact you are creating with the document. For example, &#34;Release 12, Update 6&#34;. This value is unique across all versions of a document and cannot be changed for an existing document version.
         * 
         * @return builder
         * 
         */
        public Builder versionName(String versionName) {
            return versionName(Output.of(versionName));
        }

        public DocumentArgs build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.documentType = Objects.requireNonNull($.documentType, "expected parameter 'documentType' to be non-null");
            return $;
        }
    }

}
