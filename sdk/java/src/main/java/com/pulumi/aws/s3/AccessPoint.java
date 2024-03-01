// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.AccessPointArgs;
import com.pulumi.aws.s3.inputs.AccessPointState;
import com.pulumi.aws.s3.outputs.AccessPointPublicAccessBlockConfiguration;
import com.pulumi.aws.s3.outputs.AccessPointVpcConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an S3 Access Point.
 * 
 * &gt; **NOTE on Access Points and Access Point Policies:** This provider provides both a standalone Access Point Policy resource and an Access Point resource with a resource policy defined in-line. You cannot use an Access Point with in-line resource policy in conjunction with an Access Point Policy resource. Doing so will cause a conflict of policies and will overwrite the access point&#39;s resource policy.
 * 
 * &gt; Advanced usage: To use a custom API endpoint for this resource, use the `s3control` endpoint provider configuration), not the `s3` endpoint provider configuration.
 * 
 * &gt; This resource cannot be used with S3 directory buckets.
 * 
 * ## Example Usage
 * ### AWS Partition General Purpose Bucket
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.AccessPoint;
 * import com.pulumi.aws.s3.AccessPointArgs;
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
 *         var example = new BucketV2(&#34;example&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleAccessPoint = new AccessPoint(&#34;exampleAccessPoint&#34;, AccessPointArgs.builder()        
 *             .bucket(example.id())
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### S3 on Outposts Bucket
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3control.Bucket;
 * import com.pulumi.aws.s3control.BucketArgs;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.s3.AccessPoint;
 * import com.pulumi.aws.s3.AccessPointArgs;
 * import com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs;
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
 *         var example = new Bucket(&#34;example&#34;, BucketArgs.builder()        
 *             .bucket(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleVpc = new Vpc(&#34;exampleVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleAccessPoint = new AccessPoint(&#34;exampleAccessPoint&#34;, AccessPointArgs.builder()        
 *             .bucket(example.arn())
 *             .name(&#34;example&#34;)
 *             .vpcConfiguration(AccessPointVpcConfigurationArgs.builder()
 *                 .vpcId(exampleVpc.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import using the ARN for Access Points associated with an S3 on Outposts Bucket:
 * 
 * __Using `pulumi import` to import.__ For example:
 * 
 * Import using the `account_id` and `name` separated by a colon (`:`) for Access Points associated with an AWS Partition S3 Bucket:
 * 
 * ```sh
 *  $ pulumi import aws:s3/accessPoint:AccessPoint example 123456789012:example
 * ```
 *  Import using the ARN for Access Points associated with an S3 on Outposts Bucket:
 * 
 * ```sh
 *  $ pulumi import aws:s3/accessPoint:AccessPoint example arn:aws:s3-outposts:us-east-1:123456789012:outpost/op-1234567890123456/accesspoint/example
 * ```
 * 
 */
@ResourceType(type="aws:s3/accessPoint:AccessPoint")
public class AccessPoint extends com.pulumi.resources.CustomResource {
    /**
     * AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Alias of the S3 Access Point.
     * 
     */
    @Export(name="alias", refs={String.class}, tree="[0]")
    private Output<String> alias;

    /**
     * @return Alias of the S3 Access Point.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * ARN of the S3 Access Point.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the S3 Access Point.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name of an AWS Partition S3 General Purpose Bucket or the ARN of S3 on Outposts Bucket that you want to associate this access point with.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return Name of an AWS Partition S3 General Purpose Bucket or the ARN of S3 on Outposts Bucket that you want to associate this access point with.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * AWS account ID associated with the S3 bucket associated with this access point.
     * 
     */
    @Export(name="bucketAccountId", refs={String.class}, tree="[0]")
    private Output<String> bucketAccountId;

    /**
     * @return AWS account ID associated with the S3 bucket associated with this access point.
     * 
     */
    public Output<String> bucketAccountId() {
        return this.bucketAccountId;
    }
    /**
     * DNS domain name of the S3 Access Point in the format _`name`_-_`account_id`_.s3-accesspoint._region_.amazonaws.com.
     * Note: S3 access points only support secure access by HTTPS. HTTP isn&#39;t supported.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return DNS domain name of the S3 Access Point in the format _`name`_-_`account_id`_.s3-accesspoint._region_.amazonaws.com.
     * Note: S3 access points only support secure access by HTTPS. HTTP isn&#39;t supported.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * VPC endpoints for the S3 Access Point.
     * 
     */
    @Export(name="endpoints", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> endpoints;

    /**
     * @return VPC endpoints for the S3 Access Point.
     * 
     */
    public Output<Map<String,String>> endpoints() {
        return this.endpoints;
    }
    /**
     * Indicates whether this access point currently has a policy that allows public access.
     * 
     */
    @Export(name="hasPublicAccessPolicy", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> hasPublicAccessPolicy;

    /**
     * @return Indicates whether this access point currently has a policy that allows public access.
     * 
     */
    public Output<Boolean> hasPublicAccessPolicy() {
        return this.hasPublicAccessPolicy;
    }
    /**
     * Name you want to assign to this access point.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name you want to assign to this access point.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn&#39;t allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
     * 
     */
    @Export(name="networkOrigin", refs={String.class}, tree="[0]")
    private Output<String> networkOrigin;

    /**
     * @return Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn&#39;t allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
     * 
     */
    public Output<String> networkOrigin() {
        return this.networkOrigin;
    }
    /**
     * Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * 
     */
    @Export(name="publicAccessBlockConfiguration", refs={AccessPointPublicAccessBlockConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ AccessPointPublicAccessBlockConfiguration> publicAccessBlockConfiguration;

    /**
     * @return Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * 
     */
    public Output<Optional<AccessPointPublicAccessBlockConfiguration>> publicAccessBlockConfiguration() {
        return Codegen.optional(this.publicAccessBlockConfiguration);
    }
    /**
     * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * 
     */
    @Export(name="vpcConfiguration", refs={AccessPointVpcConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ AccessPointVpcConfiguration> vpcConfiguration;

    /**
     * @return Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * 
     */
    public Output<Optional<AccessPointVpcConfiguration>> vpcConfiguration() {
        return Codegen.optional(this.vpcConfiguration);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessPoint(String name) {
        this(name, AccessPointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessPoint(String name, AccessPointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessPoint(String name, AccessPointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/accessPoint:AccessPoint", name, args == null ? AccessPointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessPoint(String name, Output<String> id, @Nullable AccessPointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/accessPoint:AccessPoint", name, state, makeResourceOptions(options, id));
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
    public static AccessPoint get(String name, Output<String> id, @Nullable AccessPointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessPoint(name, id, state, options);
    }
}
