// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow
{
    /// <summary>
    /// Provides an AppFlow connector profile resource.
    /// 
    /// For information about AppFlow flows, see the [Amazon AppFlow API Reference](https://docs.aws.amazon.com/appflow/1.0/APIReference/Welcome.html).
    /// For specific information about creating an AppFlow connector profile, see the
    /// [CreateConnectorProfile](https://docs.aws.amazon.com/appflow/1.0/APIReference/API_CreateConnectorProfile.html) page in the Amazon AppFlow API Reference.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = Aws.Iam.GetPolicy.Invoke(new()
    ///     {
    ///         Name = "AmazonRedshiftAllCommandsFullAccess",
    ///     });
    /// 
    ///     var exampleRole = new Aws.Iam.Role("example", new()
    ///     {
    ///         Name = "example_role",
    ///         ManagedPolicyArns = new[]
    ///         {
    ///             test.Arn,
    ///         },
    ///         AssumeRolePolicy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["version"] = "2012-10-17",
    ///             ["statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["action"] = "sts:AssumeRole",
    ///                     ["effect"] = "Allow",
    ///                     ["sid"] = "",
    ///                     ["principal"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["service"] = "ec2.amazonaws.com",
    ///                     },
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    ///     var exampleBucketV2 = new Aws.S3.BucketV2("example", new()
    ///     {
    ///         Bucket = "example_bucket",
    ///     });
    /// 
    ///     var exampleCluster = new Aws.RedShift.Cluster("example", new()
    ///     {
    ///         ClusterIdentifier = "example_cluster",
    ///         DatabaseName = "example_db",
    ///         MasterUsername = "exampleuser",
    ///         MasterPassword = "examplePassword123!",
    ///         NodeType = "dc1.large",
    ///         ClusterType = "single-node",
    ///     });
    /// 
    ///     var exampleConnectorProfile = new Aws.AppFlow.ConnectorProfile("example", new()
    ///     {
    ///         Name = "example_profile",
    ///         ConnectorType = "Redshift",
    ///         ConnectionMode = "Public",
    ///         ConnectorProfileConfig = new Aws.AppFlow.Inputs.ConnectorProfileConnectorProfileConfigArgs
    ///         {
    ///             ConnectorProfileCredentials = new Aws.AppFlow.Inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs
    ///             {
    ///                 Redshift = new Aws.AppFlow.Inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsRedshiftArgs
    ///                 {
    ///                     Password = exampleCluster.MasterPassword,
    ///                     Username = exampleCluster.MasterUsername,
    ///                 },
    ///             },
    ///             ConnectorProfileProperties = new Aws.AppFlow.Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs
    ///             {
    ///                 Redshift = new Aws.AppFlow.Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs
    ///                 {
    ///                     BucketName = exampleBucketV2.Name,
    ///                     DatabaseUrl = Output.Tuple(exampleCluster.Endpoint, exampleCluster.DatabaseName).Apply(values =&gt;
    ///                     {
    ///                         var endpoint = values.Item1;
    ///                         var databaseName = values.Item2;
    ///                         return $"jdbc:redshift://{endpoint}/{databaseName}";
    ///                     }),
    ///                     RoleArn = exampleRole.Arn,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import AppFlow Connector Profile using the connector profile `arn`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:appflow/connectorProfile:ConnectorProfile profile arn:aws:appflow:us-west-2:123456789012:connectorprofile/example-profile
    /// ```
    /// </summary>
    [AwsResourceType("aws:appflow/connectorProfile:ConnectorProfile")]
    public partial class ConnectorProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the connector profile.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. One of: `Public`, `Private`.
        /// </summary>
        [Output("connectionMode")]
        public Output<string> ConnectionMode { get; private set; } = null!;

        /// <summary>
        /// The label of the connector. The label is unique for each ConnectorRegistration in your AWS account. Only needed if calling for `CustomConnector` connector type.
        /// </summary>
        [Output("connectorLabel")]
        public Output<string?> ConnectorLabel { get; private set; } = null!;

        /// <summary>
        /// Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
        /// </summary>
        [Output("connectorProfileConfig")]
        public Output<Outputs.ConnectorProfileConnectorProfileConfig> ConnectorProfileConfig { get; private set; } = null!;

        /// <summary>
        /// The type of connector. One of: `Amplitude`, `CustomConnector`, `CustomerProfiles`, `Datadog`, `Dynatrace`, `EventBridge`, `Googleanalytics`, `Honeycode`, `Infornexus`, `LookoutMetrics`, `Marketo`, `Redshift`, `S3`, `Salesforce`, `SAPOData`, `Servicenow`, `Singular`, `Slack`, `Snowflake`, `Trendmicro`, `Upsolver`, `Veeva`, `Zendesk`.
        /// </summary>
        [Output("connectorType")]
        public Output<string> ConnectorType { get; private set; } = null!;

        /// <summary>
        /// ARN of the connector profile credentials.
        /// </summary>
        [Output("credentialsArn")]
        public Output<string> CredentialsArn { get; private set; } = null!;

        /// <summary>
        /// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        /// </summary>
        [Output("kmsArn")]
        public Output<string> KmsArn { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a ConnectorProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectorProfile(string name, ConnectorProfileArgs args, CustomResourceOptions? options = null)
            : base("aws:appflow/connectorProfile:ConnectorProfile", name, args ?? new ConnectorProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectorProfile(string name, Input<string> id, ConnectorProfileState? state = null, CustomResourceOptions? options = null)
            : base("aws:appflow/connectorProfile:ConnectorProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConnectorProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConnectorProfile Get(string name, Input<string> id, ConnectorProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new ConnectorProfile(name, id, state, options);
        }
    }

    public sealed class ConnectorProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. One of: `Public`, `Private`.
        /// </summary>
        [Input("connectionMode", required: true)]
        public Input<string> ConnectionMode { get; set; } = null!;

        /// <summary>
        /// The label of the connector. The label is unique for each ConnectorRegistration in your AWS account. Only needed if calling for `CustomConnector` connector type.
        /// </summary>
        [Input("connectorLabel")]
        public Input<string>? ConnectorLabel { get; set; }

        /// <summary>
        /// Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
        /// </summary>
        [Input("connectorProfileConfig", required: true)]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigArgs> ConnectorProfileConfig { get; set; } = null!;

        /// <summary>
        /// The type of connector. One of: `Amplitude`, `CustomConnector`, `CustomerProfiles`, `Datadog`, `Dynatrace`, `EventBridge`, `Googleanalytics`, `Honeycode`, `Infornexus`, `LookoutMetrics`, `Marketo`, `Redshift`, `S3`, `Salesforce`, `SAPOData`, `Servicenow`, `Singular`, `Slack`, `Snowflake`, `Trendmicro`, `Upsolver`, `Veeva`, `Zendesk`.
        /// </summary>
        [Input("connectorType", required: true)]
        public Input<string> ConnectorType { get; set; } = null!;

        /// <summary>
        /// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        /// </summary>
        [Input("kmsArn")]
        public Input<string>? KmsArn { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public ConnectorProfileArgs()
        {
        }
        public static new ConnectorProfileArgs Empty => new ConnectorProfileArgs();
    }

    public sealed class ConnectorProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the connector profile.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. One of: `Public`, `Private`.
        /// </summary>
        [Input("connectionMode")]
        public Input<string>? ConnectionMode { get; set; }

        /// <summary>
        /// The label of the connector. The label is unique for each ConnectorRegistration in your AWS account. Only needed if calling for `CustomConnector` connector type.
        /// </summary>
        [Input("connectorLabel")]
        public Input<string>? ConnectorLabel { get; set; }

        /// <summary>
        /// Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
        /// </summary>
        [Input("connectorProfileConfig")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigGetArgs>? ConnectorProfileConfig { get; set; }

        /// <summary>
        /// The type of connector. One of: `Amplitude`, `CustomConnector`, `CustomerProfiles`, `Datadog`, `Dynatrace`, `EventBridge`, `Googleanalytics`, `Honeycode`, `Infornexus`, `LookoutMetrics`, `Marketo`, `Redshift`, `S3`, `Salesforce`, `SAPOData`, `Servicenow`, `Singular`, `Slack`, `Snowflake`, `Trendmicro`, `Upsolver`, `Veeva`, `Zendesk`.
        /// </summary>
        [Input("connectorType")]
        public Input<string>? ConnectorType { get; set; }

        /// <summary>
        /// ARN of the connector profile credentials.
        /// </summary>
        [Input("credentialsArn")]
        public Input<string>? CredentialsArn { get; set; }

        /// <summary>
        /// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
        /// </summary>
        [Input("kmsArn")]
        public Input<string>? KmsArn { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public ConnectorProfileState()
        {
        }
        public static new ConnectorProfileState Empty => new ConnectorProfileState();
    }
}
