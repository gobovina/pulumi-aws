// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Signer
{
    /// <summary>
    /// Creates a Signer Signing Profile Permission. That is, a cross-account permission for a signing profile.
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
    ///     var prodSp = new Aws.Signer.SigningProfile("prod_sp", new()
    ///     {
    ///         PlatformId = "AWSLambda-SHA384-ECDSA",
    ///         NamePrefix = "prod_sp_",
    ///         SignatureValidityPeriod = new Aws.Signer.Inputs.SigningProfileSignatureValidityPeriodArgs
    ///         {
    ///             Value = 5,
    ///             Type = "YEARS",
    ///         },
    ///         Tags = 
    ///         {
    ///             { "tag1", "value1" },
    ///             { "tag2", "value2" },
    ///         },
    ///     });
    /// 
    ///     var spPermission1 = new Aws.Signer.SigningProfilePermission("sp_permission_1", new()
    ///     {
    ///         ProfileName = prodSp.Name,
    ///         Action = "signer:StartSigningJob",
    ///         Principal = awsAccount,
    ///     });
    /// 
    ///     var spPermission2 = new Aws.Signer.SigningProfilePermission("sp_permission_2", new()
    ///     {
    ///         ProfileName = prodSp.Name,
    ///         Action = "signer:GetSigningProfile",
    ///         Principal = awsTeamRoleArn,
    ///         StatementId = "ProdAccountStartSigningJob_StatementId",
    ///     });
    /// 
    ///     var spPermission3 = new Aws.Signer.SigningProfilePermission("sp_permission_3", new()
    ///     {
    ///         ProfileName = prodSp.Name,
    ///         Action = "signer:RevokeSignature",
    ///         Principal = "123456789012",
    ///         ProfileVersion = prodSp.Version,
    ///         StatementIdPrefix = "version-permission-",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Signer signing profile permission statements using profile_name/statement_id. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:signer/signingProfilePermission:SigningProfilePermission test_signer_signing_profile_permission prod_profile_DdW3Mk1foYL88fajut4mTVFGpuwfd4ACO6ANL0D1uIj7lrn8adK/ProdAccountStartSigningJobStatementId
    /// ```
    /// </summary>
    [AwsResourceType("aws:signer/signingProfilePermission:SigningProfilePermission")]
    public partial class SigningProfilePermission : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// The AWS principal to be granted a cross-account permission.
        /// </summary>
        [Output("principal")]
        public Output<string> Principal { get; private set; } = null!;

        /// <summary>
        /// Name of the signing profile to add the cross-account permissions.
        /// </summary>
        [Output("profileName")]
        public Output<string> ProfileName { get; private set; } = null!;

        /// <summary>
        /// The signing profile version that a permission applies to.
        /// </summary>
        [Output("profileVersion")]
        public Output<string> ProfileVersion { get; private set; } = null!;

        /// <summary>
        /// A unique statement identifier. By default generated by the provider.
        /// </summary>
        [Output("statementId")]
        public Output<string> StatementId { get; private set; } = null!;

        /// <summary>
        /// A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        /// </summary>
        [Output("statementIdPrefix")]
        public Output<string> StatementIdPrefix { get; private set; } = null!;


        /// <summary>
        /// Create a SigningProfilePermission resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SigningProfilePermission(string name, SigningProfilePermissionArgs args, CustomResourceOptions? options = null)
            : base("aws:signer/signingProfilePermission:SigningProfilePermission", name, args ?? new SigningProfilePermissionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SigningProfilePermission(string name, Input<string> id, SigningProfilePermissionState? state = null, CustomResourceOptions? options = null)
            : base("aws:signer/signingProfilePermission:SigningProfilePermission", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SigningProfilePermission resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SigningProfilePermission Get(string name, Input<string> id, SigningProfilePermissionState? state = null, CustomResourceOptions? options = null)
        {
            return new SigningProfilePermission(name, id, state, options);
        }
    }

    public sealed class SigningProfilePermissionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// The AWS principal to be granted a cross-account permission.
        /// </summary>
        [Input("principal", required: true)]
        public Input<string> Principal { get; set; } = null!;

        /// <summary>
        /// Name of the signing profile to add the cross-account permissions.
        /// </summary>
        [Input("profileName", required: true)]
        public Input<string> ProfileName { get; set; } = null!;

        /// <summary>
        /// The signing profile version that a permission applies to.
        /// </summary>
        [Input("profileVersion")]
        public Input<string>? ProfileVersion { get; set; }

        /// <summary>
        /// A unique statement identifier. By default generated by the provider.
        /// </summary>
        [Input("statementId")]
        public Input<string>? StatementId { get; set; }

        /// <summary>
        /// A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        /// </summary>
        [Input("statementIdPrefix")]
        public Input<string>? StatementIdPrefix { get; set; }

        public SigningProfilePermissionArgs()
        {
        }
        public static new SigningProfilePermissionArgs Empty => new SigningProfilePermissionArgs();
    }

    public sealed class SigningProfilePermissionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// The AWS principal to be granted a cross-account permission.
        /// </summary>
        [Input("principal")]
        public Input<string>? Principal { get; set; }

        /// <summary>
        /// Name of the signing profile to add the cross-account permissions.
        /// </summary>
        [Input("profileName")]
        public Input<string>? ProfileName { get; set; }

        /// <summary>
        /// The signing profile version that a permission applies to.
        /// </summary>
        [Input("profileVersion")]
        public Input<string>? ProfileVersion { get; set; }

        /// <summary>
        /// A unique statement identifier. By default generated by the provider.
        /// </summary>
        [Input("statementId")]
        public Input<string>? StatementId { get; set; }

        /// <summary>
        /// A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        /// </summary>
        [Input("statementIdPrefix")]
        public Input<string>? StatementIdPrefix { get; set; }

        public SigningProfilePermissionState()
        {
        }
        public static new SigningProfilePermissionState Empty => new SigningProfilePermissionState();
    }
}
