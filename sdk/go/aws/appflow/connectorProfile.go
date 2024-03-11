// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appflow

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AppFlow connector profile resource.
//
// For information about AppFlow flows, see the [Amazon AppFlow API Reference](https://docs.aws.amazon.com/appflow/1.0/APIReference/Welcome.html).
// For specific information about creating an AppFlow connector profile, see the
// [CreateConnectorProfile](https://docs.aws.amazon.com/appflow/1.0/APIReference/API_CreateConnectorProfile.html) page in the Amazon AppFlow API Reference.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"encoding/json"
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appflow"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/redshift"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iam.LookupPolicy(ctx, &iam.LookupPolicyArgs{
//				Name: pulumi.StringRef("AmazonRedshiftAllCommandsFullAccess"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"version": "2012-10-17",
//				"statement": []map[string]interface{}{
//					map[string]interface{}{
//						"action": "sts:AssumeRole",
//						"effect": "Allow",
//						"sid":    "",
//						"principal": map[string]interface{}{
//							"service": "ec2.amazonaws.com",
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			exampleRole, err := iam.NewRole(ctx, "example", &iam.RoleArgs{
//				Name: pulumi.String("example_role"),
//				ManagedPolicyArns: pulumi.StringArray{
//					test.Arn,
//				},
//				AssumeRolePolicy: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			exampleBucketV2, err := s3.NewBucketV2(ctx, "example", &s3.BucketV2Args{
//				Bucket: pulumi.String("example_bucket"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleCluster, err := redshift.NewCluster(ctx, "example", &redshift.ClusterArgs{
//				ClusterIdentifier: pulumi.String("example_cluster"),
//				DatabaseName:      pulumi.String("example_db"),
//				MasterUsername:    pulumi.String("exampleuser"),
//				MasterPassword:    pulumi.String("examplePassword123!"),
//				NodeType:          pulumi.String("dc1.large"),
//				ClusterType:       pulumi.String("single-node"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appflow.NewConnectorProfile(ctx, "example", &appflow.ConnectorProfileArgs{
//				Name:           pulumi.String("example_profile"),
//				ConnectorType:  pulumi.String("Redshift"),
//				ConnectionMode: pulumi.String("Public"),
//				ConnectorProfileConfig: &appflow.ConnectorProfileConnectorProfileConfigArgs{
//					ConnectorProfileCredentials: &appflow.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs{
//						Redshift: &appflow.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsRedshiftArgs{
//							Password: exampleCluster.MasterPassword,
//							Username: exampleCluster.MasterUsername,
//						},
//					},
//					ConnectorProfileProperties: &appflow.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs{
//						Redshift: &appflow.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs{
//							BucketName: exampleBucketV2.Name,
//							DatabaseUrl: pulumi.All(exampleCluster.Endpoint, exampleCluster.DatabaseName).ApplyT(func(_args []interface{}) (string, error) {
//								endpoint := _args[0].(string)
//								databaseName := _args[1].(string)
//								return fmt.Sprintf("jdbc:redshift://%v/%v", endpoint, databaseName), nil
//							}).(pulumi.StringOutput),
//							RoleArn: exampleRole.Arn,
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import AppFlow Connector Profile using the connector profile `arn`. For example:
//
// ```sh
// $ pulumi import aws:appflow/connectorProfile:ConnectorProfile profile arn:aws:appflow:us-west-2:123456789012:connectorprofile/example-profile
// ```
type ConnectorProfile struct {
	pulumi.CustomResourceState

	// ARN of the connector profile.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. One of: `Public`, `Private`.
	ConnectionMode pulumi.StringOutput `pulumi:"connectionMode"`
	// The label of the connector. The label is unique for each ConnectorRegistration in your AWS account. Only needed if calling for `CustomConnector` connector type.
	ConnectorLabel pulumi.StringPtrOutput `pulumi:"connectorLabel"`
	// Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
	ConnectorProfileConfig ConnectorProfileConnectorProfileConfigOutput `pulumi:"connectorProfileConfig"`
	// The type of connector. One of: `Amplitude`, `CustomConnector`, `CustomerProfiles`, `Datadog`, `Dynatrace`, `EventBridge`, `Googleanalytics`, `Honeycode`, `Infornexus`, `LookoutMetrics`, `Marketo`, `Redshift`, `S3`, `Salesforce`, `SAPOData`, `Servicenow`, `Singular`, `Slack`, `Snowflake`, `Trendmicro`, `Upsolver`, `Veeva`, `Zendesk`.
	ConnectorType pulumi.StringOutput `pulumi:"connectorType"`
	// ARN of the connector profile credentials.
	CredentialsArn pulumi.StringOutput `pulumi:"credentialsArn"`
	// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
	KmsArn pulumi.StringOutput `pulumi:"kmsArn"`
	Name   pulumi.StringOutput `pulumi:"name"`
}

// NewConnectorProfile registers a new resource with the given unique name, arguments, and options.
func NewConnectorProfile(ctx *pulumi.Context,
	name string, args *ConnectorProfileArgs, opts ...pulumi.ResourceOption) (*ConnectorProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionMode == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionMode'")
	}
	if args.ConnectorProfileConfig == nil {
		return nil, errors.New("invalid value for required argument 'ConnectorProfileConfig'")
	}
	if args.ConnectorType == nil {
		return nil, errors.New("invalid value for required argument 'ConnectorType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ConnectorProfile
	err := ctx.RegisterResource("aws:appflow/connectorProfile:ConnectorProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectorProfile gets an existing ConnectorProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectorProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorProfileState, opts ...pulumi.ResourceOption) (*ConnectorProfile, error) {
	var resource ConnectorProfile
	err := ctx.ReadResource("aws:appflow/connectorProfile:ConnectorProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectorProfile resources.
type connectorProfileState struct {
	// ARN of the connector profile.
	Arn *string `pulumi:"arn"`
	// Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. One of: `Public`, `Private`.
	ConnectionMode *string `pulumi:"connectionMode"`
	// The label of the connector. The label is unique for each ConnectorRegistration in your AWS account. Only needed if calling for `CustomConnector` connector type.
	ConnectorLabel *string `pulumi:"connectorLabel"`
	// Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
	ConnectorProfileConfig *ConnectorProfileConnectorProfileConfig `pulumi:"connectorProfileConfig"`
	// The type of connector. One of: `Amplitude`, `CustomConnector`, `CustomerProfiles`, `Datadog`, `Dynatrace`, `EventBridge`, `Googleanalytics`, `Honeycode`, `Infornexus`, `LookoutMetrics`, `Marketo`, `Redshift`, `S3`, `Salesforce`, `SAPOData`, `Servicenow`, `Singular`, `Slack`, `Snowflake`, `Trendmicro`, `Upsolver`, `Veeva`, `Zendesk`.
	ConnectorType *string `pulumi:"connectorType"`
	// ARN of the connector profile credentials.
	CredentialsArn *string `pulumi:"credentialsArn"`
	// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
	KmsArn *string `pulumi:"kmsArn"`
	Name   *string `pulumi:"name"`
}

type ConnectorProfileState struct {
	// ARN of the connector profile.
	Arn pulumi.StringPtrInput
	// Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. One of: `Public`, `Private`.
	ConnectionMode pulumi.StringPtrInput
	// The label of the connector. The label is unique for each ConnectorRegistration in your AWS account. Only needed if calling for `CustomConnector` connector type.
	ConnectorLabel pulumi.StringPtrInput
	// Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
	ConnectorProfileConfig ConnectorProfileConnectorProfileConfigPtrInput
	// The type of connector. One of: `Amplitude`, `CustomConnector`, `CustomerProfiles`, `Datadog`, `Dynatrace`, `EventBridge`, `Googleanalytics`, `Honeycode`, `Infornexus`, `LookoutMetrics`, `Marketo`, `Redshift`, `S3`, `Salesforce`, `SAPOData`, `Servicenow`, `Singular`, `Slack`, `Snowflake`, `Trendmicro`, `Upsolver`, `Veeva`, `Zendesk`.
	ConnectorType pulumi.StringPtrInput
	// ARN of the connector profile credentials.
	CredentialsArn pulumi.StringPtrInput
	// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
	KmsArn pulumi.StringPtrInput
	Name   pulumi.StringPtrInput
}

func (ConnectorProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorProfileState)(nil)).Elem()
}

type connectorProfileArgs struct {
	// Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. One of: `Public`, `Private`.
	ConnectionMode string `pulumi:"connectionMode"`
	// The label of the connector. The label is unique for each ConnectorRegistration in your AWS account. Only needed if calling for `CustomConnector` connector type.
	ConnectorLabel *string `pulumi:"connectorLabel"`
	// Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
	ConnectorProfileConfig ConnectorProfileConnectorProfileConfig `pulumi:"connectorProfileConfig"`
	// The type of connector. One of: `Amplitude`, `CustomConnector`, `CustomerProfiles`, `Datadog`, `Dynatrace`, `EventBridge`, `Googleanalytics`, `Honeycode`, `Infornexus`, `LookoutMetrics`, `Marketo`, `Redshift`, `S3`, `Salesforce`, `SAPOData`, `Servicenow`, `Singular`, `Slack`, `Snowflake`, `Trendmicro`, `Upsolver`, `Veeva`, `Zendesk`.
	ConnectorType string `pulumi:"connectorType"`
	// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
	KmsArn *string `pulumi:"kmsArn"`
	Name   *string `pulumi:"name"`
}

// The set of arguments for constructing a ConnectorProfile resource.
type ConnectorProfileArgs struct {
	// Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. One of: `Public`, `Private`.
	ConnectionMode pulumi.StringInput
	// The label of the connector. The label is unique for each ConnectorRegistration in your AWS account. Only needed if calling for `CustomConnector` connector type.
	ConnectorLabel pulumi.StringPtrInput
	// Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
	ConnectorProfileConfig ConnectorProfileConnectorProfileConfigInput
	// The type of connector. One of: `Amplitude`, `CustomConnector`, `CustomerProfiles`, `Datadog`, `Dynatrace`, `EventBridge`, `Googleanalytics`, `Honeycode`, `Infornexus`, `LookoutMetrics`, `Marketo`, `Redshift`, `S3`, `Salesforce`, `SAPOData`, `Servicenow`, `Singular`, `Slack`, `Snowflake`, `Trendmicro`, `Upsolver`, `Veeva`, `Zendesk`.
	ConnectorType pulumi.StringInput
	// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
	KmsArn pulumi.StringPtrInput
	Name   pulumi.StringPtrInput
}

func (ConnectorProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorProfileArgs)(nil)).Elem()
}

type ConnectorProfileInput interface {
	pulumi.Input

	ToConnectorProfileOutput() ConnectorProfileOutput
	ToConnectorProfileOutputWithContext(ctx context.Context) ConnectorProfileOutput
}

func (*ConnectorProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectorProfile)(nil)).Elem()
}

func (i *ConnectorProfile) ToConnectorProfileOutput() ConnectorProfileOutput {
	return i.ToConnectorProfileOutputWithContext(context.Background())
}

func (i *ConnectorProfile) ToConnectorProfileOutputWithContext(ctx context.Context) ConnectorProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorProfileOutput)
}

// ConnectorProfileArrayInput is an input type that accepts ConnectorProfileArray and ConnectorProfileArrayOutput values.
// You can construct a concrete instance of `ConnectorProfileArrayInput` via:
//
//	ConnectorProfileArray{ ConnectorProfileArgs{...} }
type ConnectorProfileArrayInput interface {
	pulumi.Input

	ToConnectorProfileArrayOutput() ConnectorProfileArrayOutput
	ToConnectorProfileArrayOutputWithContext(context.Context) ConnectorProfileArrayOutput
}

type ConnectorProfileArray []ConnectorProfileInput

func (ConnectorProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectorProfile)(nil)).Elem()
}

func (i ConnectorProfileArray) ToConnectorProfileArrayOutput() ConnectorProfileArrayOutput {
	return i.ToConnectorProfileArrayOutputWithContext(context.Background())
}

func (i ConnectorProfileArray) ToConnectorProfileArrayOutputWithContext(ctx context.Context) ConnectorProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorProfileArrayOutput)
}

// ConnectorProfileMapInput is an input type that accepts ConnectorProfileMap and ConnectorProfileMapOutput values.
// You can construct a concrete instance of `ConnectorProfileMapInput` via:
//
//	ConnectorProfileMap{ "key": ConnectorProfileArgs{...} }
type ConnectorProfileMapInput interface {
	pulumi.Input

	ToConnectorProfileMapOutput() ConnectorProfileMapOutput
	ToConnectorProfileMapOutputWithContext(context.Context) ConnectorProfileMapOutput
}

type ConnectorProfileMap map[string]ConnectorProfileInput

func (ConnectorProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectorProfile)(nil)).Elem()
}

func (i ConnectorProfileMap) ToConnectorProfileMapOutput() ConnectorProfileMapOutput {
	return i.ToConnectorProfileMapOutputWithContext(context.Background())
}

func (i ConnectorProfileMap) ToConnectorProfileMapOutputWithContext(ctx context.Context) ConnectorProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorProfileMapOutput)
}

type ConnectorProfileOutput struct{ *pulumi.OutputState }

func (ConnectorProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectorProfile)(nil)).Elem()
}

func (o ConnectorProfileOutput) ToConnectorProfileOutput() ConnectorProfileOutput {
	return o
}

func (o ConnectorProfileOutput) ToConnectorProfileOutputWithContext(ctx context.Context) ConnectorProfileOutput {
	return o
}

// ARN of the connector profile.
func (o ConnectorProfileOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorProfile) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. One of: `Public`, `Private`.
func (o ConnectorProfileOutput) ConnectionMode() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorProfile) pulumi.StringOutput { return v.ConnectionMode }).(pulumi.StringOutput)
}

// The label of the connector. The label is unique for each ConnectorRegistration in your AWS account. Only needed if calling for `CustomConnector` connector type.
func (o ConnectorProfileOutput) ConnectorLabel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConnectorProfile) pulumi.StringPtrOutput { return v.ConnectorLabel }).(pulumi.StringPtrOutput)
}

// Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
func (o ConnectorProfileOutput) ConnectorProfileConfig() ConnectorProfileConnectorProfileConfigOutput {
	return o.ApplyT(func(v *ConnectorProfile) ConnectorProfileConnectorProfileConfigOutput {
		return v.ConnectorProfileConfig
	}).(ConnectorProfileConnectorProfileConfigOutput)
}

// The type of connector. One of: `Amplitude`, `CustomConnector`, `CustomerProfiles`, `Datadog`, `Dynatrace`, `EventBridge`, `Googleanalytics`, `Honeycode`, `Infornexus`, `LookoutMetrics`, `Marketo`, `Redshift`, `S3`, `Salesforce`, `SAPOData`, `Servicenow`, `Singular`, `Slack`, `Snowflake`, `Trendmicro`, `Upsolver`, `Veeva`, `Zendesk`.
func (o ConnectorProfileOutput) ConnectorType() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorProfile) pulumi.StringOutput { return v.ConnectorType }).(pulumi.StringOutput)
}

// ARN of the connector profile credentials.
func (o ConnectorProfileOutput) CredentialsArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorProfile) pulumi.StringOutput { return v.CredentialsArn }).(pulumi.StringOutput)
}

// ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
func (o ConnectorProfileOutput) KmsArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorProfile) pulumi.StringOutput { return v.KmsArn }).(pulumi.StringOutput)
}

func (o ConnectorProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectorProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type ConnectorProfileArrayOutput struct{ *pulumi.OutputState }

func (ConnectorProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectorProfile)(nil)).Elem()
}

func (o ConnectorProfileArrayOutput) ToConnectorProfileArrayOutput() ConnectorProfileArrayOutput {
	return o
}

func (o ConnectorProfileArrayOutput) ToConnectorProfileArrayOutputWithContext(ctx context.Context) ConnectorProfileArrayOutput {
	return o
}

func (o ConnectorProfileArrayOutput) Index(i pulumi.IntInput) ConnectorProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectorProfile {
		return vs[0].([]*ConnectorProfile)[vs[1].(int)]
	}).(ConnectorProfileOutput)
}

type ConnectorProfileMapOutput struct{ *pulumi.OutputState }

func (ConnectorProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectorProfile)(nil)).Elem()
}

func (o ConnectorProfileMapOutput) ToConnectorProfileMapOutput() ConnectorProfileMapOutput {
	return o
}

func (o ConnectorProfileMapOutput) ToConnectorProfileMapOutputWithContext(ctx context.Context) ConnectorProfileMapOutput {
	return o
}

func (o ConnectorProfileMapOutput) MapIndex(k pulumi.StringInput) ConnectorProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectorProfile {
		return vs[0].(map[string]*ConnectorProfile)[vs[1].(string)]
	}).(ConnectorProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorProfileInput)(nil)).Elem(), &ConnectorProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorProfileArrayInput)(nil)).Elem(), ConnectorProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorProfileMapInput)(nil)).Elem(), ConnectorProfileMap{})
	pulumi.RegisterOutputType(ConnectorProfileOutput{})
	pulumi.RegisterOutputType(ConnectorProfileArrayOutput{})
	pulumi.RegisterOutputType(ConnectorProfileMapOutput{})
}
