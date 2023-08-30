// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package emr

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Elastic MapReduce Studio.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/emr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := emr.NewStudio(ctx, "example", &emr.StudioArgs{
//				AuthMode:              pulumi.String("SSO"),
//				DefaultS3Location:     pulumi.String(fmt.Sprintf("s3://%v/test", aws_s3_bucket.Test.Bucket)),
//				EngineSecurityGroupId: pulumi.Any(aws_security_group.Test.Id),
//				ServiceRole:           pulumi.Any(aws_iam_role.Test.Arn),
//				SubnetIds: pulumi.StringArray{
//					aws_subnet.Test.Id,
//				},
//				UserRole:                 pulumi.Any(aws_iam_role.Test.Arn),
//				VpcId:                    pulumi.Any(aws_vpc.Test.Id),
//				WorkspaceSecurityGroupId: pulumi.Any(aws_security_group.Test.Id),
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
// Using `pulumi import`, import EMR studios using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:emr/studio:Studio studio es-123456ABCDEF
//
// ```
type Studio struct {
	pulumi.CustomResourceState

	// ARN of the studio.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specifies whether the Studio authenticates users using IAM or Amazon Web Services SSO. Valid values are `SSO` or `IAM`.
	AuthMode pulumi.StringOutput `pulumi:"authMode"`
	// The Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
	DefaultS3Location pulumi.StringOutput `pulumi:"defaultS3Location"`
	// A detailed description of the Amazon EMR Studio.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic from the Workspace security group, and it must be in the same VPC specified by `vpcId`.
	EngineSecurityGroupId pulumi.StringOutput `pulumi:"engineSecurityGroupId"`
	// The authentication endpoint of your identity provider (IdP). Specify this value when you use IAM authentication and want to let federated users log in to a Studio with the Studio URL and credentials from your IdP. Amazon EMR Studio redirects users to this endpoint to enter credentials.
	IdpAuthUrl pulumi.StringPtrOutput `pulumi:"idpAuthUrl"`
	// The name that your identity provider (IdP) uses for its RelayState parameter. For example, RelayState or TargetSource. Specify this value when you use IAM authentication and want to let federated users log in to a Studio using the Studio URL. The RelayState parameter differs by IdP.
	IdpRelayStateParameterName pulumi.StringPtrOutput `pulumi:"idpRelayStateParameterName"`
	// A descriptive name for the Amazon EMR Studio.
	Name pulumi.StringOutput `pulumi:"name"`
	// The IAM role that the Amazon EMR Studio assumes. The service role provides a way for Amazon EMR Studio to interoperate with other Amazon Web Services services.
	ServiceRole pulumi.StringOutput `pulumi:"serviceRole"`
	// A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by `vpcId`. Studio users can create a Workspace in any of the specified subnets.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// list of tags to apply to the EMR Cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapOutput `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The unique access URL of the Amazon EMR Studio.
	Url pulumi.StringOutput `pulumi:"url"`
	// The IAM user role that users and groups assume when logged in to an Amazon EMR Studio. Only specify a User Role when you use Amazon Web Services SSO authentication. The permissions attached to the User Role can be scoped down for each user or group using session policies.
	UserRole pulumi.StringPtrOutput `pulumi:"userRole"`
	// The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network traffic to resources in the Engine security group, and it must be in the same VPC specified by `vpcId`.
	//
	// The following arguments are optional:
	WorkspaceSecurityGroupId pulumi.StringOutput `pulumi:"workspaceSecurityGroupId"`
}

// NewStudio registers a new resource with the given unique name, arguments, and options.
func NewStudio(ctx *pulumi.Context,
	name string, args *StudioArgs, opts ...pulumi.ResourceOption) (*Studio, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthMode == nil {
		return nil, errors.New("invalid value for required argument 'AuthMode'")
	}
	if args.DefaultS3Location == nil {
		return nil, errors.New("invalid value for required argument 'DefaultS3Location'")
	}
	if args.EngineSecurityGroupId == nil {
		return nil, errors.New("invalid value for required argument 'EngineSecurityGroupId'")
	}
	if args.ServiceRole == nil {
		return nil, errors.New("invalid value for required argument 'ServiceRole'")
	}
	if args.SubnetIds == nil {
		return nil, errors.New("invalid value for required argument 'SubnetIds'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	if args.WorkspaceSecurityGroupId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceSecurityGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Studio
	err := ctx.RegisterResource("aws:emr/studio:Studio", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStudio gets an existing Studio resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStudio(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StudioState, opts ...pulumi.ResourceOption) (*Studio, error) {
	var resource Studio
	err := ctx.ReadResource("aws:emr/studio:Studio", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Studio resources.
type studioState struct {
	// ARN of the studio.
	Arn *string `pulumi:"arn"`
	// Specifies whether the Studio authenticates users using IAM or Amazon Web Services SSO. Valid values are `SSO` or `IAM`.
	AuthMode *string `pulumi:"authMode"`
	// The Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
	DefaultS3Location *string `pulumi:"defaultS3Location"`
	// A detailed description of the Amazon EMR Studio.
	Description *string `pulumi:"description"`
	// The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic from the Workspace security group, and it must be in the same VPC specified by `vpcId`.
	EngineSecurityGroupId *string `pulumi:"engineSecurityGroupId"`
	// The authentication endpoint of your identity provider (IdP). Specify this value when you use IAM authentication and want to let federated users log in to a Studio with the Studio URL and credentials from your IdP. Amazon EMR Studio redirects users to this endpoint to enter credentials.
	IdpAuthUrl *string `pulumi:"idpAuthUrl"`
	// The name that your identity provider (IdP) uses for its RelayState parameter. For example, RelayState or TargetSource. Specify this value when you use IAM authentication and want to let federated users log in to a Studio using the Studio URL. The RelayState parameter differs by IdP.
	IdpRelayStateParameterName *string `pulumi:"idpRelayStateParameterName"`
	// A descriptive name for the Amazon EMR Studio.
	Name *string `pulumi:"name"`
	// The IAM role that the Amazon EMR Studio assumes. The service role provides a way for Amazon EMR Studio to interoperate with other Amazon Web Services services.
	ServiceRole *string `pulumi:"serviceRole"`
	// A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by `vpcId`. Studio users can create a Workspace in any of the specified subnets.
	SubnetIds []string `pulumi:"subnetIds"`
	// list of tags to apply to the EMR Cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The unique access URL of the Amazon EMR Studio.
	Url *string `pulumi:"url"`
	// The IAM user role that users and groups assume when logged in to an Amazon EMR Studio. Only specify a User Role when you use Amazon Web Services SSO authentication. The permissions attached to the User Role can be scoped down for each user or group using session policies.
	UserRole *string `pulumi:"userRole"`
	// The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
	VpcId *string `pulumi:"vpcId"`
	// The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network traffic to resources in the Engine security group, and it must be in the same VPC specified by `vpcId`.
	//
	// The following arguments are optional:
	WorkspaceSecurityGroupId *string `pulumi:"workspaceSecurityGroupId"`
}

type StudioState struct {
	// ARN of the studio.
	Arn pulumi.StringPtrInput
	// Specifies whether the Studio authenticates users using IAM or Amazon Web Services SSO. Valid values are `SSO` or `IAM`.
	AuthMode pulumi.StringPtrInput
	// The Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
	DefaultS3Location pulumi.StringPtrInput
	// A detailed description of the Amazon EMR Studio.
	Description pulumi.StringPtrInput
	// The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic from the Workspace security group, and it must be in the same VPC specified by `vpcId`.
	EngineSecurityGroupId pulumi.StringPtrInput
	// The authentication endpoint of your identity provider (IdP). Specify this value when you use IAM authentication and want to let federated users log in to a Studio with the Studio URL and credentials from your IdP. Amazon EMR Studio redirects users to this endpoint to enter credentials.
	IdpAuthUrl pulumi.StringPtrInput
	// The name that your identity provider (IdP) uses for its RelayState parameter. For example, RelayState or TargetSource. Specify this value when you use IAM authentication and want to let federated users log in to a Studio using the Studio URL. The RelayState parameter differs by IdP.
	IdpRelayStateParameterName pulumi.StringPtrInput
	// A descriptive name for the Amazon EMR Studio.
	Name pulumi.StringPtrInput
	// The IAM role that the Amazon EMR Studio assumes. The service role provides a way for Amazon EMR Studio to interoperate with other Amazon Web Services services.
	ServiceRole pulumi.StringPtrInput
	// A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by `vpcId`. Studio users can create a Workspace in any of the specified subnets.
	SubnetIds pulumi.StringArrayInput
	// list of tags to apply to the EMR Cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
	// The unique access URL of the Amazon EMR Studio.
	Url pulumi.StringPtrInput
	// The IAM user role that users and groups assume when logged in to an Amazon EMR Studio. Only specify a User Role when you use Amazon Web Services SSO authentication. The permissions attached to the User Role can be scoped down for each user or group using session policies.
	UserRole pulumi.StringPtrInput
	// The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
	VpcId pulumi.StringPtrInput
	// The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network traffic to resources in the Engine security group, and it must be in the same VPC specified by `vpcId`.
	//
	// The following arguments are optional:
	WorkspaceSecurityGroupId pulumi.StringPtrInput
}

func (StudioState) ElementType() reflect.Type {
	return reflect.TypeOf((*studioState)(nil)).Elem()
}

type studioArgs struct {
	// Specifies whether the Studio authenticates users using IAM or Amazon Web Services SSO. Valid values are `SSO` or `IAM`.
	AuthMode string `pulumi:"authMode"`
	// The Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
	DefaultS3Location string `pulumi:"defaultS3Location"`
	// A detailed description of the Amazon EMR Studio.
	Description *string `pulumi:"description"`
	// The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic from the Workspace security group, and it must be in the same VPC specified by `vpcId`.
	EngineSecurityGroupId string `pulumi:"engineSecurityGroupId"`
	// The authentication endpoint of your identity provider (IdP). Specify this value when you use IAM authentication and want to let federated users log in to a Studio with the Studio URL and credentials from your IdP. Amazon EMR Studio redirects users to this endpoint to enter credentials.
	IdpAuthUrl *string `pulumi:"idpAuthUrl"`
	// The name that your identity provider (IdP) uses for its RelayState parameter. For example, RelayState or TargetSource. Specify this value when you use IAM authentication and want to let federated users log in to a Studio using the Studio URL. The RelayState parameter differs by IdP.
	IdpRelayStateParameterName *string `pulumi:"idpRelayStateParameterName"`
	// A descriptive name for the Amazon EMR Studio.
	Name *string `pulumi:"name"`
	// The IAM role that the Amazon EMR Studio assumes. The service role provides a way for Amazon EMR Studio to interoperate with other Amazon Web Services services.
	ServiceRole string `pulumi:"serviceRole"`
	// A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by `vpcId`. Studio users can create a Workspace in any of the specified subnets.
	SubnetIds []string `pulumi:"subnetIds"`
	// list of tags to apply to the EMR Cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The IAM user role that users and groups assume when logged in to an Amazon EMR Studio. Only specify a User Role when you use Amazon Web Services SSO authentication. The permissions attached to the User Role can be scoped down for each user or group using session policies.
	UserRole *string `pulumi:"userRole"`
	// The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
	VpcId string `pulumi:"vpcId"`
	// The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network traffic to resources in the Engine security group, and it must be in the same VPC specified by `vpcId`.
	//
	// The following arguments are optional:
	WorkspaceSecurityGroupId string `pulumi:"workspaceSecurityGroupId"`
}

// The set of arguments for constructing a Studio resource.
type StudioArgs struct {
	// Specifies whether the Studio authenticates users using IAM or Amazon Web Services SSO. Valid values are `SSO` or `IAM`.
	AuthMode pulumi.StringInput
	// The Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
	DefaultS3Location pulumi.StringInput
	// A detailed description of the Amazon EMR Studio.
	Description pulumi.StringPtrInput
	// The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic from the Workspace security group, and it must be in the same VPC specified by `vpcId`.
	EngineSecurityGroupId pulumi.StringInput
	// The authentication endpoint of your identity provider (IdP). Specify this value when you use IAM authentication and want to let federated users log in to a Studio with the Studio URL and credentials from your IdP. Amazon EMR Studio redirects users to this endpoint to enter credentials.
	IdpAuthUrl pulumi.StringPtrInput
	// The name that your identity provider (IdP) uses for its RelayState parameter. For example, RelayState or TargetSource. Specify this value when you use IAM authentication and want to let federated users log in to a Studio using the Studio URL. The RelayState parameter differs by IdP.
	IdpRelayStateParameterName pulumi.StringPtrInput
	// A descriptive name for the Amazon EMR Studio.
	Name pulumi.StringPtrInput
	// The IAM role that the Amazon EMR Studio assumes. The service role provides a way for Amazon EMR Studio to interoperate with other Amazon Web Services services.
	ServiceRole pulumi.StringInput
	// A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by `vpcId`. Studio users can create a Workspace in any of the specified subnets.
	SubnetIds pulumi.StringArrayInput
	// list of tags to apply to the EMR Cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The IAM user role that users and groups assume when logged in to an Amazon EMR Studio. Only specify a User Role when you use Amazon Web Services SSO authentication. The permissions attached to the User Role can be scoped down for each user or group using session policies.
	UserRole pulumi.StringPtrInput
	// The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
	VpcId pulumi.StringInput
	// The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network traffic to resources in the Engine security group, and it must be in the same VPC specified by `vpcId`.
	//
	// The following arguments are optional:
	WorkspaceSecurityGroupId pulumi.StringInput
}

func (StudioArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*studioArgs)(nil)).Elem()
}

type StudioInput interface {
	pulumi.Input

	ToStudioOutput() StudioOutput
	ToStudioOutputWithContext(ctx context.Context) StudioOutput
}

func (*Studio) ElementType() reflect.Type {
	return reflect.TypeOf((**Studio)(nil)).Elem()
}

func (i *Studio) ToStudioOutput() StudioOutput {
	return i.ToStudioOutputWithContext(context.Background())
}

func (i *Studio) ToStudioOutputWithContext(ctx context.Context) StudioOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StudioOutput)
}

// StudioArrayInput is an input type that accepts StudioArray and StudioArrayOutput values.
// You can construct a concrete instance of `StudioArrayInput` via:
//
//	StudioArray{ StudioArgs{...} }
type StudioArrayInput interface {
	pulumi.Input

	ToStudioArrayOutput() StudioArrayOutput
	ToStudioArrayOutputWithContext(context.Context) StudioArrayOutput
}

type StudioArray []StudioInput

func (StudioArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Studio)(nil)).Elem()
}

func (i StudioArray) ToStudioArrayOutput() StudioArrayOutput {
	return i.ToStudioArrayOutputWithContext(context.Background())
}

func (i StudioArray) ToStudioArrayOutputWithContext(ctx context.Context) StudioArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StudioArrayOutput)
}

// StudioMapInput is an input type that accepts StudioMap and StudioMapOutput values.
// You can construct a concrete instance of `StudioMapInput` via:
//
//	StudioMap{ "key": StudioArgs{...} }
type StudioMapInput interface {
	pulumi.Input

	ToStudioMapOutput() StudioMapOutput
	ToStudioMapOutputWithContext(context.Context) StudioMapOutput
}

type StudioMap map[string]StudioInput

func (StudioMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Studio)(nil)).Elem()
}

func (i StudioMap) ToStudioMapOutput() StudioMapOutput {
	return i.ToStudioMapOutputWithContext(context.Background())
}

func (i StudioMap) ToStudioMapOutputWithContext(ctx context.Context) StudioMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StudioMapOutput)
}

type StudioOutput struct{ *pulumi.OutputState }

func (StudioOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Studio)(nil)).Elem()
}

func (o StudioOutput) ToStudioOutput() StudioOutput {
	return o
}

func (o StudioOutput) ToStudioOutputWithContext(ctx context.Context) StudioOutput {
	return o
}

// ARN of the studio.
func (o StudioOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specifies whether the Studio authenticates users using IAM or Amazon Web Services SSO. Valid values are `SSO` or `IAM`.
func (o StudioOutput) AuthMode() pulumi.StringOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringOutput { return v.AuthMode }).(pulumi.StringOutput)
}

// The Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
func (o StudioOutput) DefaultS3Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringOutput { return v.DefaultS3Location }).(pulumi.StringOutput)
}

// A detailed description of the Amazon EMR Studio.
func (o StudioOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic from the Workspace security group, and it must be in the same VPC specified by `vpcId`.
func (o StudioOutput) EngineSecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringOutput { return v.EngineSecurityGroupId }).(pulumi.StringOutput)
}

// The authentication endpoint of your identity provider (IdP). Specify this value when you use IAM authentication and want to let federated users log in to a Studio with the Studio URL and credentials from your IdP. Amazon EMR Studio redirects users to this endpoint to enter credentials.
func (o StudioOutput) IdpAuthUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringPtrOutput { return v.IdpAuthUrl }).(pulumi.StringPtrOutput)
}

// The name that your identity provider (IdP) uses for its RelayState parameter. For example, RelayState or TargetSource. Specify this value when you use IAM authentication and want to let federated users log in to a Studio using the Studio URL. The RelayState parameter differs by IdP.
func (o StudioOutput) IdpRelayStateParameterName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringPtrOutput { return v.IdpRelayStateParameterName }).(pulumi.StringPtrOutput)
}

// A descriptive name for the Amazon EMR Studio.
func (o StudioOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The IAM role that the Amazon EMR Studio assumes. The service role provides a way for Amazon EMR Studio to interoperate with other Amazon Web Services services.
func (o StudioOutput) ServiceRole() pulumi.StringOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringOutput { return v.ServiceRole }).(pulumi.StringOutput)
}

// A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by `vpcId`. Studio users can create a Workspace in any of the specified subnets.
func (o StudioOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringArrayOutput { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// list of tags to apply to the EMR Cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o StudioOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

func (o StudioOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The unique access URL of the Amazon EMR Studio.
func (o StudioOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// The IAM user role that users and groups assume when logged in to an Amazon EMR Studio. Only specify a User Role when you use Amazon Web Services SSO authentication. The permissions attached to the User Role can be scoped down for each user or group using session policies.
func (o StudioOutput) UserRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringPtrOutput { return v.UserRole }).(pulumi.StringPtrOutput)
}

// The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
func (o StudioOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network traffic to resources in the Engine security group, and it must be in the same VPC specified by `vpcId`.
//
// The following arguments are optional:
func (o StudioOutput) WorkspaceSecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Studio) pulumi.StringOutput { return v.WorkspaceSecurityGroupId }).(pulumi.StringOutput)
}

type StudioArrayOutput struct{ *pulumi.OutputState }

func (StudioArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Studio)(nil)).Elem()
}

func (o StudioArrayOutput) ToStudioArrayOutput() StudioArrayOutput {
	return o
}

func (o StudioArrayOutput) ToStudioArrayOutputWithContext(ctx context.Context) StudioArrayOutput {
	return o
}

func (o StudioArrayOutput) Index(i pulumi.IntInput) StudioOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Studio {
		return vs[0].([]*Studio)[vs[1].(int)]
	}).(StudioOutput)
}

type StudioMapOutput struct{ *pulumi.OutputState }

func (StudioMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Studio)(nil)).Elem()
}

func (o StudioMapOutput) ToStudioMapOutput() StudioMapOutput {
	return o
}

func (o StudioMapOutput) ToStudioMapOutputWithContext(ctx context.Context) StudioMapOutput {
	return o
}

func (o StudioMapOutput) MapIndex(k pulumi.StringInput) StudioOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Studio {
		return vs[0].(map[string]*Studio)[vs[1].(string)]
	}).(StudioOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StudioInput)(nil)).Elem(), &Studio{})
	pulumi.RegisterInputType(reflect.TypeOf((*StudioArrayInput)(nil)).Elem(), StudioArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StudioMapInput)(nil)).Elem(), StudioMap{})
	pulumi.RegisterOutputType(StudioOutput{})
	pulumi.RegisterOutputType(StudioArrayOutput{})
	pulumi.RegisterOutputType(StudioMapOutput{})
}
