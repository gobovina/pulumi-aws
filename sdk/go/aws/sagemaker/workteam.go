// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sagemaker

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a SageMaker Workteam resource.
//
// ## Example Usage
//
// ### Cognito Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sagemaker.NewWorkteam(ctx, "example", &sagemaker.WorkteamArgs{
//				WorkteamName:  pulumi.String("example"),
//				WorkforceName: pulumi.Any(exampleAwsSagemakerWorkforce.Id),
//				Description:   pulumi.String("example"),
//				MemberDefinitions: sagemaker.WorkteamMemberDefinitionArray{
//					&sagemaker.WorkteamMemberDefinitionArgs{
//						CognitoMemberDefinition: &sagemaker.WorkteamMemberDefinitionCognitoMemberDefinitionArgs{
//							ClientId:  pulumi.Any(exampleAwsCognitoUserPoolClient.Id),
//							UserPool:  pulumi.Any(exampleAwsCognitoUserPoolDomain.UserPoolId),
//							UserGroup: pulumi.Any(exampleAwsCognitoUserGroup.Id),
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
// ### Oidc Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sagemaker.NewWorkteam(ctx, "example", &sagemaker.WorkteamArgs{
//				WorkteamName:  pulumi.String("example"),
//				WorkforceName: pulumi.Any(exampleAwsSagemakerWorkforce.Id),
//				Description:   pulumi.String("example"),
//				MemberDefinitions: sagemaker.WorkteamMemberDefinitionArray{
//					&sagemaker.WorkteamMemberDefinitionArgs{
//						OidcMemberDefinition: &sagemaker.WorkteamMemberDefinitionOidcMemberDefinitionArgs{
//							Groups: pulumi.StringArray{
//								pulumi.String("example"),
//							},
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
// Using `pulumi import`, import SageMaker Workteams using the `workteam_name`. For example:
//
// ```sh
// $ pulumi import aws:sagemaker/workteam:Workteam example example
// ```
type Workteam struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) assigned by AWS to this Workteam.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A description of the work team.
	Description pulumi.StringOutput `pulumi:"description"`
	// A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
	MemberDefinitions WorkteamMemberDefinitionArrayOutput `pulumi:"memberDefinitions"`
	// Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
	NotificationConfiguration WorkteamNotificationConfigurationPtrOutput `pulumi:"notificationConfiguration"`
	// The subdomain for your OIDC Identity Provider.
	Subdomain pulumi.StringOutput `pulumi:"subdomain"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The name of the Workteam (must be unique).
	WorkforceName pulumi.StringOutput `pulumi:"workforceName"`
	// The name of the workforce.
	WorkteamName pulumi.StringOutput `pulumi:"workteamName"`
}

// NewWorkteam registers a new resource with the given unique name, arguments, and options.
func NewWorkteam(ctx *pulumi.Context,
	name string, args *WorkteamArgs, opts ...pulumi.ResourceOption) (*Workteam, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.MemberDefinitions == nil {
		return nil, errors.New("invalid value for required argument 'MemberDefinitions'")
	}
	if args.WorkforceName == nil {
		return nil, errors.New("invalid value for required argument 'WorkforceName'")
	}
	if args.WorkteamName == nil {
		return nil, errors.New("invalid value for required argument 'WorkteamName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Workteam
	err := ctx.RegisterResource("aws:sagemaker/workteam:Workteam", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkteam gets an existing Workteam resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkteam(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkteamState, opts ...pulumi.ResourceOption) (*Workteam, error) {
	var resource Workteam
	err := ctx.ReadResource("aws:sagemaker/workteam:Workteam", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Workteam resources.
type workteamState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Workteam.
	Arn *string `pulumi:"arn"`
	// A description of the work team.
	Description *string `pulumi:"description"`
	// A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
	MemberDefinitions []WorkteamMemberDefinition `pulumi:"memberDefinitions"`
	// Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
	NotificationConfiguration *WorkteamNotificationConfiguration `pulumi:"notificationConfiguration"`
	// The subdomain for your OIDC Identity Provider.
	Subdomain *string `pulumi:"subdomain"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The name of the Workteam (must be unique).
	WorkforceName *string `pulumi:"workforceName"`
	// The name of the workforce.
	WorkteamName *string `pulumi:"workteamName"`
}

type WorkteamState struct {
	// The Amazon Resource Name (ARN) assigned by AWS to this Workteam.
	Arn pulumi.StringPtrInput
	// A description of the work team.
	Description pulumi.StringPtrInput
	// A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
	MemberDefinitions WorkteamMemberDefinitionArrayInput
	// Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
	NotificationConfiguration WorkteamNotificationConfigurationPtrInput
	// The subdomain for your OIDC Identity Provider.
	Subdomain pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The name of the Workteam (must be unique).
	WorkforceName pulumi.StringPtrInput
	// The name of the workforce.
	WorkteamName pulumi.StringPtrInput
}

func (WorkteamState) ElementType() reflect.Type {
	return reflect.TypeOf((*workteamState)(nil)).Elem()
}

type workteamArgs struct {
	// A description of the work team.
	Description string `pulumi:"description"`
	// A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
	MemberDefinitions []WorkteamMemberDefinition `pulumi:"memberDefinitions"`
	// Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
	NotificationConfiguration *WorkteamNotificationConfiguration `pulumi:"notificationConfiguration"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The name of the Workteam (must be unique).
	WorkforceName string `pulumi:"workforceName"`
	// The name of the workforce.
	WorkteamName string `pulumi:"workteamName"`
}

// The set of arguments for constructing a Workteam resource.
type WorkteamArgs struct {
	// A description of the work team.
	Description pulumi.StringInput
	// A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
	MemberDefinitions WorkteamMemberDefinitionArrayInput
	// Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
	NotificationConfiguration WorkteamNotificationConfigurationPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The name of the Workteam (must be unique).
	WorkforceName pulumi.StringInput
	// The name of the workforce.
	WorkteamName pulumi.StringInput
}

func (WorkteamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workteamArgs)(nil)).Elem()
}

type WorkteamInput interface {
	pulumi.Input

	ToWorkteamOutput() WorkteamOutput
	ToWorkteamOutputWithContext(ctx context.Context) WorkteamOutput
}

func (*Workteam) ElementType() reflect.Type {
	return reflect.TypeOf((**Workteam)(nil)).Elem()
}

func (i *Workteam) ToWorkteamOutput() WorkteamOutput {
	return i.ToWorkteamOutputWithContext(context.Background())
}

func (i *Workteam) ToWorkteamOutputWithContext(ctx context.Context) WorkteamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkteamOutput)
}

// WorkteamArrayInput is an input type that accepts WorkteamArray and WorkteamArrayOutput values.
// You can construct a concrete instance of `WorkteamArrayInput` via:
//
//	WorkteamArray{ WorkteamArgs{...} }
type WorkteamArrayInput interface {
	pulumi.Input

	ToWorkteamArrayOutput() WorkteamArrayOutput
	ToWorkteamArrayOutputWithContext(context.Context) WorkteamArrayOutput
}

type WorkteamArray []WorkteamInput

func (WorkteamArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workteam)(nil)).Elem()
}

func (i WorkteamArray) ToWorkteamArrayOutput() WorkteamArrayOutput {
	return i.ToWorkteamArrayOutputWithContext(context.Background())
}

func (i WorkteamArray) ToWorkteamArrayOutputWithContext(ctx context.Context) WorkteamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkteamArrayOutput)
}

// WorkteamMapInput is an input type that accepts WorkteamMap and WorkteamMapOutput values.
// You can construct a concrete instance of `WorkteamMapInput` via:
//
//	WorkteamMap{ "key": WorkteamArgs{...} }
type WorkteamMapInput interface {
	pulumi.Input

	ToWorkteamMapOutput() WorkteamMapOutput
	ToWorkteamMapOutputWithContext(context.Context) WorkteamMapOutput
}

type WorkteamMap map[string]WorkteamInput

func (WorkteamMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workteam)(nil)).Elem()
}

func (i WorkteamMap) ToWorkteamMapOutput() WorkteamMapOutput {
	return i.ToWorkteamMapOutputWithContext(context.Background())
}

func (i WorkteamMap) ToWorkteamMapOutputWithContext(ctx context.Context) WorkteamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkteamMapOutput)
}

type WorkteamOutput struct{ *pulumi.OutputState }

func (WorkteamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Workteam)(nil)).Elem()
}

func (o WorkteamOutput) ToWorkteamOutput() WorkteamOutput {
	return o
}

func (o WorkteamOutput) ToWorkteamOutputWithContext(ctx context.Context) WorkteamOutput {
	return o
}

// The Amazon Resource Name (ARN) assigned by AWS to this Workteam.
func (o WorkteamOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Workteam) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A description of the work team.
func (o WorkteamOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Workteam) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
func (o WorkteamOutput) MemberDefinitions() WorkteamMemberDefinitionArrayOutput {
	return o.ApplyT(func(v *Workteam) WorkteamMemberDefinitionArrayOutput { return v.MemberDefinitions }).(WorkteamMemberDefinitionArrayOutput)
}

// Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
func (o WorkteamOutput) NotificationConfiguration() WorkteamNotificationConfigurationPtrOutput {
	return o.ApplyT(func(v *Workteam) WorkteamNotificationConfigurationPtrOutput { return v.NotificationConfiguration }).(WorkteamNotificationConfigurationPtrOutput)
}

// The subdomain for your OIDC Identity Provider.
func (o WorkteamOutput) Subdomain() pulumi.StringOutput {
	return o.ApplyT(func(v *Workteam) pulumi.StringOutput { return v.Subdomain }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o WorkteamOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Workteam) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o WorkteamOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Workteam) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The name of the Workteam (must be unique).
func (o WorkteamOutput) WorkforceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Workteam) pulumi.StringOutput { return v.WorkforceName }).(pulumi.StringOutput)
}

// The name of the workforce.
func (o WorkteamOutput) WorkteamName() pulumi.StringOutput {
	return o.ApplyT(func(v *Workteam) pulumi.StringOutput { return v.WorkteamName }).(pulumi.StringOutput)
}

type WorkteamArrayOutput struct{ *pulumi.OutputState }

func (WorkteamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workteam)(nil)).Elem()
}

func (o WorkteamArrayOutput) ToWorkteamArrayOutput() WorkteamArrayOutput {
	return o
}

func (o WorkteamArrayOutput) ToWorkteamArrayOutputWithContext(ctx context.Context) WorkteamArrayOutput {
	return o
}

func (o WorkteamArrayOutput) Index(i pulumi.IntInput) WorkteamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Workteam {
		return vs[0].([]*Workteam)[vs[1].(int)]
	}).(WorkteamOutput)
}

type WorkteamMapOutput struct{ *pulumi.OutputState }

func (WorkteamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workteam)(nil)).Elem()
}

func (o WorkteamMapOutput) ToWorkteamMapOutput() WorkteamMapOutput {
	return o
}

func (o WorkteamMapOutput) ToWorkteamMapOutputWithContext(ctx context.Context) WorkteamMapOutput {
	return o
}

func (o WorkteamMapOutput) MapIndex(k pulumi.StringInput) WorkteamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Workteam {
		return vs[0].(map[string]*Workteam)[vs[1].(string)]
	}).(WorkteamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkteamInput)(nil)).Elem(), &Workteam{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkteamArrayInput)(nil)).Elem(), WorkteamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkteamMapInput)(nil)).Elem(), WorkteamMap{})
	pulumi.RegisterOutputType(WorkteamOutput{})
	pulumi.RegisterOutputType(WorkteamArrayOutput{})
	pulumi.RegisterOutputType(WorkteamMapOutput{})
}
