// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.AmiCopyArgs;
import com.pulumi.aws.ec2.inputs.AmiCopyState;
import com.pulumi.aws.ec2.outputs.AmiCopyEbsBlockDevice;
import com.pulumi.aws.ec2.outputs.AmiCopyEphemeralBlockDevice;
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
 * The &#34;AMI copy&#34; resource allows duplication of an Amazon Machine Image (AMI),
 * including cross-region copies.
 * 
 * If the source AMI has associated EBS snapshots, those will also be duplicated
 * along with the AMI.
 * 
 * This is useful for taking a single AMI provisioned in one region and making
 * it available in another for a multi-region deployment.
 * 
 * Copying an AMI can take several minutes. The creation of this resource will
 * block until the new AMI is available for use on new instances.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.AmiCopy;
 * import com.pulumi.aws.ec2.AmiCopyArgs;
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
 *         var example = new AmiCopy(&#34;example&#34;, AmiCopyArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .description(&#34;A copy of ami-xxxxxxxx&#34;)
 *             .sourceAmiId(&#34;ami-xxxxxxxx&#34;)
 *             .sourceAmiRegion(&#34;us-west-1&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;HelloWorld&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:ec2/amiCopy:AmiCopy")
public class AmiCopy extends com.pulumi.resources.CustomResource {
    /**
     * Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
     * 
     */
    @Export(name="architecture", refs={String.class}, tree="[0]")
    private Output<String> architecture;

    /**
     * @return Machine architecture for created instances. Defaults to &#34;x86_64&#34;.
     * 
     */
    public Output<String> architecture() {
        return this.architecture;
    }
    /**
     * ARN of the AMI.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the AMI.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    @Export(name="bootMode", refs={String.class}, tree="[0]")
    private Output<String> bootMode;

    /**
     * @return Boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    public Output<String> bootMode() {
        return this.bootMode;
    }
    /**
     * Date and time to deprecate the AMI. If you specified a value for seconds, Amazon EC2 rounds the seconds to the nearest minute. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    @Export(name="deprecationTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deprecationTime;

    /**
     * @return Date and time to deprecate the AMI. If you specified a value for seconds, Amazon EC2 rounds the seconds to the nearest minute. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    public Output<Optional<String>> deprecationTime() {
        return Codegen.optional(this.deprecationTime);
    }
    /**
     * Longer, human-readable description for the AMI.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Longer, human-readable description for the AMI.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * ARN of the Outpost to which to copy the AMI.
     * Only specify this parameter when copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost.
     * 
     */
    @Export(name="destinationOutpostArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationOutpostArn;

    /**
     * @return ARN of the Outpost to which to copy the AMI.
     * Only specify this parameter when copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost.
     * 
     */
    public Output<Optional<String>> destinationOutpostArn() {
        return Codegen.optional(this.destinationOutpostArn);
    }
    /**
     * Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    @Export(name="ebsBlockDevices", refs={List.class,AmiCopyEbsBlockDevice.class}, tree="[0,1]")
    private Output<List<AmiCopyEbsBlockDevice>> ebsBlockDevices;

    /**
     * @return Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    public Output<List<AmiCopyEbsBlockDevice>> ebsBlockDevices() {
        return this.ebsBlockDevices;
    }
    /**
     * Whether enhanced networking with ENA is enabled. Defaults to `false`.
     * 
     */
    @Export(name="enaSupport", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enaSupport;

    /**
     * @return Whether enhanced networking with ENA is enabled. Defaults to `false`.
     * 
     */
    public Output<Boolean> enaSupport() {
        return this.enaSupport;
    }
    /**
     * Whether the destination snapshots of the copied image should be encrypted. Defaults to `false`
     * 
     */
    @Export(name="encrypted", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encrypted;

    /**
     * @return Whether the destination snapshots of the copied image should be encrypted. Defaults to `false`
     * 
     */
    public Output<Optional<Boolean>> encrypted() {
        return Codegen.optional(this.encrypted);
    }
    /**
     * Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    @Export(name="ephemeralBlockDevices", refs={List.class,AmiCopyEphemeralBlockDevice.class}, tree="[0,1]")
    private Output<List<AmiCopyEphemeralBlockDevice>> ephemeralBlockDevices;

    /**
     * @return Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    public Output<List<AmiCopyEphemeralBlockDevice>> ephemeralBlockDevices() {
        return this.ephemeralBlockDevices;
    }
    @Export(name="hypervisor", refs={String.class}, tree="[0]")
    private Output<String> hypervisor;

    public Output<String> hypervisor() {
        return this.hypervisor;
    }
    /**
     * Path to an S3 object containing an image manifest, e.g., created
     * by the `ec2-upload-bundle` command in the EC2 command line tools.
     * 
     */
    @Export(name="imageLocation", refs={String.class}, tree="[0]")
    private Output<String> imageLocation;

    /**
     * @return Path to an S3 object containing an image manifest, e.g., created
     * by the `ec2-upload-bundle` command in the EC2 command line tools.
     * 
     */
    public Output<String> imageLocation() {
        return this.imageLocation;
    }
    @Export(name="imageOwnerAlias", refs={String.class}, tree="[0]")
    private Output<String> imageOwnerAlias;

    public Output<String> imageOwnerAlias() {
        return this.imageOwnerAlias;
    }
    @Export(name="imageType", refs={String.class}, tree="[0]")
    private Output<String> imageType;

    public Output<String> imageType() {
        return this.imageType;
    }
    /**
     * If EC2 instances started from this image should require the use of the Instance Metadata Service V2 (IMDSv2), set this argument to `v2.0`. For more information, see [Configure instance metadata options for new instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration).
     * 
     */
    @Export(name="imdsSupport", refs={String.class}, tree="[0]")
    private Output<String> imdsSupport;

    /**
     * @return If EC2 instances started from this image should require the use of the Instance Metadata Service V2 (IMDSv2), set this argument to `v2.0`. For more information, see [Configure instance metadata options for new instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration).
     * 
     */
    public Output<String> imdsSupport() {
        return this.imdsSupport;
    }
    /**
     * ID of the kernel image (AKI) that will be used as the paravirtual
     * kernel in created instances.
     * 
     */
    @Export(name="kernelId", refs={String.class}, tree="[0]")
    private Output<String> kernelId;

    /**
     * @return ID of the kernel image (AKI) that will be used as the paravirtual
     * kernel in created instances.
     * 
     */
    public Output<String> kernelId() {
        return this.kernelId;
    }
    /**
     * Full ARN of the KMS Key to use when encrypting the snapshots of an image during a copy operation. If not specified, then the default AWS KMS Key will be used
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return Full ARN of the KMS Key to use when encrypting the snapshots of an image during a copy operation. If not specified, then the default AWS KMS Key will be used
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    @Export(name="manageEbsSnapshots", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> manageEbsSnapshots;

    public Output<Boolean> manageEbsSnapshots() {
        return this.manageEbsSnapshots;
    }
    /**
     * Region-unique name for the AMI.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Region-unique name for the AMI.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    public Output<String> ownerId() {
        return this.ownerId;
    }
    @Export(name="platform", refs={String.class}, tree="[0]")
    private Output<String> platform;

    public Output<String> platform() {
        return this.platform;
    }
    @Export(name="platformDetails", refs={String.class}, tree="[0]")
    private Output<String> platformDetails;

    public Output<String> platformDetails() {
        return this.platformDetails;
    }
    @Export(name="public", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> public_;

    public Output<Boolean> public_() {
        return this.public_;
    }
    /**
     * ID of an initrd image (ARI) that will be used when booting the
     * created instances.
     * 
     */
    @Export(name="ramdiskId", refs={String.class}, tree="[0]")
    private Output<String> ramdiskId;

    /**
     * @return ID of an initrd image (ARI) that will be used when booting the
     * created instances.
     * 
     */
    public Output<String> ramdiskId() {
        return this.ramdiskId;
    }
    /**
     * Name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
     * 
     */
    @Export(name="rootDeviceName", refs={String.class}, tree="[0]")
    private Output<String> rootDeviceName;

    /**
     * @return Name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
     * 
     */
    public Output<String> rootDeviceName() {
        return this.rootDeviceName;
    }
    @Export(name="rootSnapshotId", refs={String.class}, tree="[0]")
    private Output<String> rootSnapshotId;

    public Output<String> rootSnapshotId() {
        return this.rootSnapshotId;
    }
    /**
     * Id of the AMI to copy. This id must be valid in the region
     * given by `source_ami_region`.
     * 
     */
    @Export(name="sourceAmiId", refs={String.class}, tree="[0]")
    private Output<String> sourceAmiId;

    /**
     * @return Id of the AMI to copy. This id must be valid in the region
     * given by `source_ami_region`.
     * 
     */
    public Output<String> sourceAmiId() {
        return this.sourceAmiId;
    }
    /**
     * Region from which the AMI will be copied. This may be the
     * same as the AWS provider region in order to create a copy within the same region.
     * 
     */
    @Export(name="sourceAmiRegion", refs={String.class}, tree="[0]")
    private Output<String> sourceAmiRegion;

    /**
     * @return Region from which the AMI will be copied. This may be the
     * same as the AWS provider region in order to create a copy within the same region.
     * 
     */
    public Output<String> sourceAmiRegion() {
        return this.sourceAmiRegion;
    }
    /**
     * When set to &#34;simple&#34; (the default), enables enhanced networking
     * for created instances. No other value is supported at this time.
     * 
     */
    @Export(name="sriovNetSupport", refs={String.class}, tree="[0]")
    private Output<String> sriovNetSupport;

    /**
     * @return When set to &#34;simple&#34; (the default), enables enhanced networking
     * for created instances. No other value is supported at this time.
     * 
     */
    public Output<String> sriovNetSupport() {
        return this.sriovNetSupport;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * If the image is configured for NitroTPM support, the value is `v2.0`. For more information, see [NitroTPM](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitrotpm.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    @Export(name="tpmSupport", refs={String.class}, tree="[0]")
    private Output<String> tpmSupport;

    /**
     * @return If the image is configured for NitroTPM support, the value is `v2.0`. For more information, see [NitroTPM](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitrotpm.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    public Output<String> tpmSupport() {
        return this.tpmSupport;
    }
    @Export(name="usageOperation", refs={String.class}, tree="[0]")
    private Output<String> usageOperation;

    public Output<String> usageOperation() {
        return this.usageOperation;
    }
    /**
     * Keyword to choose what virtualization mode created instances
     * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
     * changes the set of further arguments that are required, as described below.
     * 
     */
    @Export(name="virtualizationType", refs={String.class}, tree="[0]")
    private Output<String> virtualizationType;

    /**
     * @return Keyword to choose what virtualization mode created instances
     * will use. Can be either &#34;paravirtual&#34; (the default) or &#34;hvm&#34;. The choice of virtualization type
     * changes the set of further arguments that are required, as described below.
     * 
     */
    public Output<String> virtualizationType() {
        return this.virtualizationType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AmiCopy(String name) {
        this(name, AmiCopyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AmiCopy(String name, AmiCopyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AmiCopy(String name, AmiCopyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/amiCopy:AmiCopy", name, args == null ? AmiCopyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AmiCopy(String name, Output<String> id, @Nullable AmiCopyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/amiCopy:AmiCopy", name, state, makeResourceOptions(options, id));
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
    public static AmiCopy get(String name, Output<String> id, @Nullable AmiCopyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AmiCopy(name, id, state, options);
    }
}
