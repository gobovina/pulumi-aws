// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appconfig

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AppConfig Deployment resource for an `appconfig.Application` resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appconfig"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := appconfig.NewDeployment(ctx, "example", &appconfig.DeploymentArgs{
//				ApplicationId:          pulumi.Any(exampleAwsAppconfigApplication.Id),
//				ConfigurationProfileId: pulumi.Any(exampleAwsAppconfigConfigurationProfile.ConfigurationProfileId),
//				ConfigurationVersion:   pulumi.Any(exampleAwsAppconfigHostedConfigurationVersion.VersionNumber),
//				DeploymentStrategyId:   pulumi.Any(exampleAwsAppconfigDeploymentStrategy.Id),
//				Description:            pulumi.String("My example deployment"),
//				EnvironmentId:          pulumi.Any(exampleAwsAppconfigEnvironment.EnvironmentId),
//				KmsKeyIdentifier:       pulumi.Any(exampleAwsKmsKey.Arn),
//				Tags: pulumi.StringMap{
//					"Type": pulumi.String("AppConfig Deployment"),
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
//
// ## Import
//
// Using `pulumi import`, import AppConfig Deployments using the application ID, environment ID, and deployment number separated by a slash (`/`). For example:
//
// ```sh
//
//	$ pulumi import aws:appconfig/deployment:Deployment example 71abcde/11xxxxx/1
//
// ```
type Deployment struct {
	pulumi.CustomResourceState

	// Application ID. Must be between 4 and 7 characters in length.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// ARN of the AppConfig Deployment.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Configuration profile ID. Must be between 4 and 7 characters in length.
	ConfigurationProfileId pulumi.StringOutput `pulumi:"configurationProfileId"`
	// Configuration version to deploy. Can be at most 1024 characters.
	ConfigurationVersion pulumi.StringOutput `pulumi:"configurationVersion"`
	// Deployment number.
	DeploymentNumber pulumi.IntOutput `pulumi:"deploymentNumber"`
	// Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
	DeploymentStrategyId pulumi.StringOutput `pulumi:"deploymentStrategyId"`
	// Description of the deployment. Can be at most 1024 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Environment ID. Must be between 4 and 7 characters in length.
	EnvironmentId pulumi.StringOutput `pulumi:"environmentId"`
	// ARN of the KMS key used to encrypt configuration data.
	KmsKeyArn pulumi.StringOutput `pulumi:"kmsKeyArn"`
	// The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
	KmsKeyIdentifier pulumi.StringPtrOutput `pulumi:"kmsKeyIdentifier"`
	// State of the deployment.
	State pulumi.StringOutput `pulumi:"state"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewDeployment registers a new resource with the given unique name, arguments, and options.
func NewDeployment(ctx *pulumi.Context,
	name string, args *DeploymentArgs, opts ...pulumi.ResourceOption) (*Deployment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationId'")
	}
	if args.ConfigurationProfileId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigurationProfileId'")
	}
	if args.ConfigurationVersion == nil {
		return nil, errors.New("invalid value for required argument 'ConfigurationVersion'")
	}
	if args.DeploymentStrategyId == nil {
		return nil, errors.New("invalid value for required argument 'DeploymentStrategyId'")
	}
	if args.EnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'EnvironmentId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Deployment
	err := ctx.RegisterResource("aws:appconfig/deployment:Deployment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeployment gets an existing Deployment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeployment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentState, opts ...pulumi.ResourceOption) (*Deployment, error) {
	var resource Deployment
	err := ctx.ReadResource("aws:appconfig/deployment:Deployment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Deployment resources.
type deploymentState struct {
	// Application ID. Must be between 4 and 7 characters in length.
	ApplicationId *string `pulumi:"applicationId"`
	// ARN of the AppConfig Deployment.
	Arn *string `pulumi:"arn"`
	// Configuration profile ID. Must be between 4 and 7 characters in length.
	ConfigurationProfileId *string `pulumi:"configurationProfileId"`
	// Configuration version to deploy. Can be at most 1024 characters.
	ConfigurationVersion *string `pulumi:"configurationVersion"`
	// Deployment number.
	DeploymentNumber *int `pulumi:"deploymentNumber"`
	// Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
	DeploymentStrategyId *string `pulumi:"deploymentStrategyId"`
	// Description of the deployment. Can be at most 1024 characters.
	Description *string `pulumi:"description"`
	// Environment ID. Must be between 4 and 7 characters in length.
	EnvironmentId *string `pulumi:"environmentId"`
	// ARN of the KMS key used to encrypt configuration data.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
	KmsKeyIdentifier *string `pulumi:"kmsKeyIdentifier"`
	// State of the deployment.
	State *string `pulumi:"state"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type DeploymentState struct {
	// Application ID. Must be between 4 and 7 characters in length.
	ApplicationId pulumi.StringPtrInput
	// ARN of the AppConfig Deployment.
	Arn pulumi.StringPtrInput
	// Configuration profile ID. Must be between 4 and 7 characters in length.
	ConfigurationProfileId pulumi.StringPtrInput
	// Configuration version to deploy. Can be at most 1024 characters.
	ConfigurationVersion pulumi.StringPtrInput
	// Deployment number.
	DeploymentNumber pulumi.IntPtrInput
	// Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
	DeploymentStrategyId pulumi.StringPtrInput
	// Description of the deployment. Can be at most 1024 characters.
	Description pulumi.StringPtrInput
	// Environment ID. Must be between 4 and 7 characters in length.
	EnvironmentId pulumi.StringPtrInput
	// ARN of the KMS key used to encrypt configuration data.
	KmsKeyArn pulumi.StringPtrInput
	// The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
	KmsKeyIdentifier pulumi.StringPtrInput
	// State of the deployment.
	State pulumi.StringPtrInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (DeploymentState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentState)(nil)).Elem()
}

type deploymentArgs struct {
	// Application ID. Must be between 4 and 7 characters in length.
	ApplicationId string `pulumi:"applicationId"`
	// Configuration profile ID. Must be between 4 and 7 characters in length.
	ConfigurationProfileId string `pulumi:"configurationProfileId"`
	// Configuration version to deploy. Can be at most 1024 characters.
	ConfigurationVersion string `pulumi:"configurationVersion"`
	// Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
	DeploymentStrategyId string `pulumi:"deploymentStrategyId"`
	// Description of the deployment. Can be at most 1024 characters.
	Description *string `pulumi:"description"`
	// Environment ID. Must be between 4 and 7 characters in length.
	EnvironmentId string `pulumi:"environmentId"`
	// The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
	KmsKeyIdentifier *string `pulumi:"kmsKeyIdentifier"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Deployment resource.
type DeploymentArgs struct {
	// Application ID. Must be between 4 and 7 characters in length.
	ApplicationId pulumi.StringInput
	// Configuration profile ID. Must be between 4 and 7 characters in length.
	ConfigurationProfileId pulumi.StringInput
	// Configuration version to deploy. Can be at most 1024 characters.
	ConfigurationVersion pulumi.StringInput
	// Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
	DeploymentStrategyId pulumi.StringInput
	// Description of the deployment. Can be at most 1024 characters.
	Description pulumi.StringPtrInput
	// Environment ID. Must be between 4 and 7 characters in length.
	EnvironmentId pulumi.StringInput
	// The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
	KmsKeyIdentifier pulumi.StringPtrInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (DeploymentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentArgs)(nil)).Elem()
}

type DeploymentInput interface {
	pulumi.Input

	ToDeploymentOutput() DeploymentOutput
	ToDeploymentOutputWithContext(ctx context.Context) DeploymentOutput
}

func (*Deployment) ElementType() reflect.Type {
	return reflect.TypeOf((**Deployment)(nil)).Elem()
}

func (i *Deployment) ToDeploymentOutput() DeploymentOutput {
	return i.ToDeploymentOutputWithContext(context.Background())
}

func (i *Deployment) ToDeploymentOutputWithContext(ctx context.Context) DeploymentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentOutput)
}

// DeploymentArrayInput is an input type that accepts DeploymentArray and DeploymentArrayOutput values.
// You can construct a concrete instance of `DeploymentArrayInput` via:
//
//	DeploymentArray{ DeploymentArgs{...} }
type DeploymentArrayInput interface {
	pulumi.Input

	ToDeploymentArrayOutput() DeploymentArrayOutput
	ToDeploymentArrayOutputWithContext(context.Context) DeploymentArrayOutput
}

type DeploymentArray []DeploymentInput

func (DeploymentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Deployment)(nil)).Elem()
}

func (i DeploymentArray) ToDeploymentArrayOutput() DeploymentArrayOutput {
	return i.ToDeploymentArrayOutputWithContext(context.Background())
}

func (i DeploymentArray) ToDeploymentArrayOutputWithContext(ctx context.Context) DeploymentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentArrayOutput)
}

// DeploymentMapInput is an input type that accepts DeploymentMap and DeploymentMapOutput values.
// You can construct a concrete instance of `DeploymentMapInput` via:
//
//	DeploymentMap{ "key": DeploymentArgs{...} }
type DeploymentMapInput interface {
	pulumi.Input

	ToDeploymentMapOutput() DeploymentMapOutput
	ToDeploymentMapOutputWithContext(context.Context) DeploymentMapOutput
}

type DeploymentMap map[string]DeploymentInput

func (DeploymentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Deployment)(nil)).Elem()
}

func (i DeploymentMap) ToDeploymentMapOutput() DeploymentMapOutput {
	return i.ToDeploymentMapOutputWithContext(context.Background())
}

func (i DeploymentMap) ToDeploymentMapOutputWithContext(ctx context.Context) DeploymentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentMapOutput)
}

type DeploymentOutput struct{ *pulumi.OutputState }

func (DeploymentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Deployment)(nil)).Elem()
}

func (o DeploymentOutput) ToDeploymentOutput() DeploymentOutput {
	return o
}

func (o DeploymentOutput) ToDeploymentOutputWithContext(ctx context.Context) DeploymentOutput {
	return o
}

// Application ID. Must be between 4 and 7 characters in length.
func (o DeploymentOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.ApplicationId }).(pulumi.StringOutput)
}

// ARN of the AppConfig Deployment.
func (o DeploymentOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Configuration profile ID. Must be between 4 and 7 characters in length.
func (o DeploymentOutput) ConfigurationProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.ConfigurationProfileId }).(pulumi.StringOutput)
}

// Configuration version to deploy. Can be at most 1024 characters.
func (o DeploymentOutput) ConfigurationVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.ConfigurationVersion }).(pulumi.StringOutput)
}

// Deployment number.
func (o DeploymentOutput) DeploymentNumber() pulumi.IntOutput {
	return o.ApplyT(func(v *Deployment) pulumi.IntOutput { return v.DeploymentNumber }).(pulumi.IntOutput)
}

// Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
func (o DeploymentOutput) DeploymentStrategyId() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.DeploymentStrategyId }).(pulumi.StringOutput)
}

// Description of the deployment. Can be at most 1024 characters.
func (o DeploymentOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Environment ID. Must be between 4 and 7 characters in length.
func (o DeploymentOutput) EnvironmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.EnvironmentId }).(pulumi.StringOutput)
}

// ARN of the KMS key used to encrypt configuration data.
func (o DeploymentOutput) KmsKeyArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.KmsKeyArn }).(pulumi.StringOutput)
}

// The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
func (o DeploymentOutput) KmsKeyIdentifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringPtrOutput { return v.KmsKeyIdentifier }).(pulumi.StringPtrOutput)
}

// State of the deployment.
func (o DeploymentOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o DeploymentOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o DeploymentOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type DeploymentArrayOutput struct{ *pulumi.OutputState }

func (DeploymentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Deployment)(nil)).Elem()
}

func (o DeploymentArrayOutput) ToDeploymentArrayOutput() DeploymentArrayOutput {
	return o
}

func (o DeploymentArrayOutput) ToDeploymentArrayOutputWithContext(ctx context.Context) DeploymentArrayOutput {
	return o
}

func (o DeploymentArrayOutput) Index(i pulumi.IntInput) DeploymentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Deployment {
		return vs[0].([]*Deployment)[vs[1].(int)]
	}).(DeploymentOutput)
}

type DeploymentMapOutput struct{ *pulumi.OutputState }

func (DeploymentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Deployment)(nil)).Elem()
}

func (o DeploymentMapOutput) ToDeploymentMapOutput() DeploymentMapOutput {
	return o
}

func (o DeploymentMapOutput) ToDeploymentMapOutputWithContext(ctx context.Context) DeploymentMapOutput {
	return o
}

func (o DeploymentMapOutput) MapIndex(k pulumi.StringInput) DeploymentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Deployment {
		return vs[0].(map[string]*Deployment)[vs[1].(string)]
	}).(DeploymentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentInput)(nil)).Elem(), &Deployment{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentArrayInput)(nil)).Elem(), DeploymentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentMapInput)(nil)).Elem(), DeploymentMap{})
	pulumi.RegisterOutputType(DeploymentOutput{})
	pulumi.RegisterOutputType(DeploymentArrayOutput{})
	pulumi.RegisterOutputType(DeploymentMapOutput{})
}
