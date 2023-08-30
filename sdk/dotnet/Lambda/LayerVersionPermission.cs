// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lambda
{
    /// <summary>
    /// Provides a Lambda Layer Version Permission resource. It allows you to share you own Lambda Layers to another account by account ID, to all accounts in AWS organization or even to all AWS accounts.
    /// 
    /// For information about Lambda Layer Permissions and how to use them, see [Using Resource-based Policies for AWS Lambda][1]
    /// 
    /// &gt; **NOTE:** Setting `skip_destroy` to `true` means that the AWS Provider will _not_ destroy any layer version permission, even when running `pulumi destroy`. Layer version permissions are thus intentional dangling resources that are _not_ managed by Pulumi and may incur extra expense in your AWS account.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var lambdaLayerPermission = new Aws.Lambda.LayerVersionPermission("lambdaLayerPermission", new()
    ///     {
    ///         Action = "lambda:GetLayerVersion",
    ///         LayerName = "arn:aws:lambda:us-west-2:123456654321:layer:test_layer1",
    ///         Principal = "111111111111",
    ///         StatementId = "dev-account",
    ///         VersionNumber = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Lambda Layer Permissions using `layer_name` and `version_number`, separated by a comma (`,`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:lambda/layerVersionPermission:LayerVersionPermission example arn:aws:lambda:us-west-2:123456654321:layer:test_layer1,1
    /// ```
    /// </summary>
    [AwsResourceType("aws:lambda/layerVersionPermission:LayerVersionPermission")]
    public partial class LayerVersionPermission : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Action, which will be allowed. `lambda:GetLayerVersion` value is suggested by AWS documantation.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// The name or ARN of the Lambda Layer, which you want to grant access to.
        /// </summary>
        [Output("layerName")]
        public Output<string> LayerName { get; private set; } = null!;

        /// <summary>
        /// An identifier of AWS Organization, which should be able to use your Lambda Layer. `principal` should be equal to `*` if `organization_id` provided.
        /// </summary>
        [Output("organizationId")]
        public Output<string?> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// Full Lambda Layer Permission policy.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// AWS account ID which should be able to use your Lambda Layer. `*` can be used here, if you want to share your Lambda Layer widely.
        /// </summary>
        [Output("principal")]
        public Output<string> Principal { get; private set; } = null!;

        /// <summary>
        /// A unique identifier for the current revision of the policy.
        /// </summary>
        [Output("revisionId")]
        public Output<string> RevisionId { get; private set; } = null!;

        /// <summary>
        /// Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
        /// </summary>
        [Output("skipDestroy")]
        public Output<bool?> SkipDestroy { get; private set; } = null!;

        /// <summary>
        /// The name of Lambda Layer Permission, for example `dev-account` - human readable note about what is this permission for.
        /// </summary>
        [Output("statementId")]
        public Output<string> StatementId { get; private set; } = null!;

        /// <summary>
        /// Version of Lambda Layer, which you want to grant access to. Note: permissions only apply to a single version of a layer.
        /// </summary>
        [Output("versionNumber")]
        public Output<int> VersionNumber { get; private set; } = null!;


        /// <summary>
        /// Create a LayerVersionPermission resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LayerVersionPermission(string name, LayerVersionPermissionArgs args, CustomResourceOptions? options = null)
            : base("aws:lambda/layerVersionPermission:LayerVersionPermission", name, args ?? new LayerVersionPermissionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LayerVersionPermission(string name, Input<string> id, LayerVersionPermissionState? state = null, CustomResourceOptions? options = null)
            : base("aws:lambda/layerVersionPermission:LayerVersionPermission", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LayerVersionPermission resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LayerVersionPermission Get(string name, Input<string> id, LayerVersionPermissionState? state = null, CustomResourceOptions? options = null)
        {
            return new LayerVersionPermission(name, id, state, options);
        }
    }

    public sealed class LayerVersionPermissionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action, which will be allowed. `lambda:GetLayerVersion` value is suggested by AWS documantation.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// The name or ARN of the Lambda Layer, which you want to grant access to.
        /// </summary>
        [Input("layerName", required: true)]
        public Input<string> LayerName { get; set; } = null!;

        /// <summary>
        /// An identifier of AWS Organization, which should be able to use your Lambda Layer. `principal` should be equal to `*` if `organization_id` provided.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// AWS account ID which should be able to use your Lambda Layer. `*` can be used here, if you want to share your Lambda Layer widely.
        /// </summary>
        [Input("principal", required: true)]
        public Input<string> Principal { get; set; } = null!;

        /// <summary>
        /// Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
        /// </summary>
        [Input("skipDestroy")]
        public Input<bool>? SkipDestroy { get; set; }

        /// <summary>
        /// The name of Lambda Layer Permission, for example `dev-account` - human readable note about what is this permission for.
        /// </summary>
        [Input("statementId", required: true)]
        public Input<string> StatementId { get; set; } = null!;

        /// <summary>
        /// Version of Lambda Layer, which you want to grant access to. Note: permissions only apply to a single version of a layer.
        /// </summary>
        [Input("versionNumber", required: true)]
        public Input<int> VersionNumber { get; set; } = null!;

        public LayerVersionPermissionArgs()
        {
        }
        public static new LayerVersionPermissionArgs Empty => new LayerVersionPermissionArgs();
    }

    public sealed class LayerVersionPermissionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action, which will be allowed. `lambda:GetLayerVersion` value is suggested by AWS documantation.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// The name or ARN of the Lambda Layer, which you want to grant access to.
        /// </summary>
        [Input("layerName")]
        public Input<string>? LayerName { get; set; }

        /// <summary>
        /// An identifier of AWS Organization, which should be able to use your Lambda Layer. `principal` should be equal to `*` if `organization_id` provided.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// Full Lambda Layer Permission policy.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// AWS account ID which should be able to use your Lambda Layer. `*` can be used here, if you want to share your Lambda Layer widely.
        /// </summary>
        [Input("principal")]
        public Input<string>? Principal { get; set; }

        /// <summary>
        /// A unique identifier for the current revision of the policy.
        /// </summary>
        [Input("revisionId")]
        public Input<string>? RevisionId { get; set; }

        /// <summary>
        /// Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
        /// </summary>
        [Input("skipDestroy")]
        public Input<bool>? SkipDestroy { get; set; }

        /// <summary>
        /// The name of Lambda Layer Permission, for example `dev-account` - human readable note about what is this permission for.
        /// </summary>
        [Input("statementId")]
        public Input<string>? StatementId { get; set; }

        /// <summary>
        /// Version of Lambda Layer, which you want to grant access to. Note: permissions only apply to a single version of a layer.
        /// </summary>
        [Input("versionNumber")]
        public Input<int>? VersionNumber { get; set; }

        public LayerVersionPermissionState()
        {
        }
        public static new LayerVersionPermissionState Empty => new LayerVersionPermissionState();
    }
}
