// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package connect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon Connect Security Profile resource. For more information see
// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewSecurityProfile(ctx, "example", &connect.SecurityProfileArgs{
//				InstanceId:  pulumi.String("aaaaaaaa-bbbb-cccc-dddd-111111111111"),
//				Name:        pulumi.String("example"),
//				Description: pulumi.String("example description"),
//				Permissions: pulumi.StringArray{
//					pulumi.String("BasicAgentAccess"),
//					pulumi.String("OutboundCallAccess"),
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("Example Security Profile"),
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
// Using `pulumi import`, import Amazon Connect Security Profiles using the `instance_id` and `security_profile_id` separated by a colon (`:`). For example:
//
// ```sh
// $ pulumi import aws:connect/securityProfile:SecurityProfile example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
// ```
type SecurityProfile struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the Security Profile.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specifies the description of the Security Profile.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Specifies the name of the Security Profile.
	Name pulumi.StringOutput `pulumi:"name"`
	// The organization resource identifier for the security profile.
	OrganizationResourceId pulumi.StringOutput `pulumi:"organizationResourceId"`
	// Specifies a list of permissions assigned to the security profile.
	Permissions pulumi.StringArrayOutput `pulumi:"permissions"`
	// The identifier for the Security Profile.
	SecurityProfileId pulumi.StringOutput `pulumi:"securityProfileId"`
	// Tags to apply to the Security Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewSecurityProfile registers a new resource with the given unique name, arguments, and options.
func NewSecurityProfile(ctx *pulumi.Context,
	name string, args *SecurityProfileArgs, opts ...pulumi.ResourceOption) (*SecurityProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecurityProfile
	err := ctx.RegisterResource("aws:connect/securityProfile:SecurityProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecurityProfile gets an existing SecurityProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecurityProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecurityProfileState, opts ...pulumi.ResourceOption) (*SecurityProfile, error) {
	var resource SecurityProfile
	err := ctx.ReadResource("aws:connect/securityProfile:SecurityProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecurityProfile resources.
type securityProfileState struct {
	// The Amazon Resource Name (ARN) of the Security Profile.
	Arn *string `pulumi:"arn"`
	// Specifies the description of the Security Profile.
	Description *string `pulumi:"description"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId *string `pulumi:"instanceId"`
	// Specifies the name of the Security Profile.
	Name *string `pulumi:"name"`
	// The organization resource identifier for the security profile.
	OrganizationResourceId *string `pulumi:"organizationResourceId"`
	// Specifies a list of permissions assigned to the security profile.
	Permissions []string `pulumi:"permissions"`
	// The identifier for the Security Profile.
	SecurityProfileId *string `pulumi:"securityProfileId"`
	// Tags to apply to the Security Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type SecurityProfileState struct {
	// The Amazon Resource Name (ARN) of the Security Profile.
	Arn pulumi.StringPtrInput
	// Specifies the description of the Security Profile.
	Description pulumi.StringPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringPtrInput
	// Specifies the name of the Security Profile.
	Name pulumi.StringPtrInput
	// The organization resource identifier for the security profile.
	OrganizationResourceId pulumi.StringPtrInput
	// Specifies a list of permissions assigned to the security profile.
	Permissions pulumi.StringArrayInput
	// The identifier for the Security Profile.
	SecurityProfileId pulumi.StringPtrInput
	// Tags to apply to the Security Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (SecurityProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*securityProfileState)(nil)).Elem()
}

type securityProfileArgs struct {
	// Specifies the description of the Security Profile.
	Description *string `pulumi:"description"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId string `pulumi:"instanceId"`
	// Specifies the name of the Security Profile.
	Name *string `pulumi:"name"`
	// Specifies a list of permissions assigned to the security profile.
	Permissions []string `pulumi:"permissions"`
	// Tags to apply to the Security Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a SecurityProfile resource.
type SecurityProfileArgs struct {
	// Specifies the description of the Security Profile.
	Description pulumi.StringPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringInput
	// Specifies the name of the Security Profile.
	Name pulumi.StringPtrInput
	// Specifies a list of permissions assigned to the security profile.
	Permissions pulumi.StringArrayInput
	// Tags to apply to the Security Profile. If configured with a provider
	// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (SecurityProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*securityProfileArgs)(nil)).Elem()
}

type SecurityProfileInput interface {
	pulumi.Input

	ToSecurityProfileOutput() SecurityProfileOutput
	ToSecurityProfileOutputWithContext(ctx context.Context) SecurityProfileOutput
}

func (*SecurityProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityProfile)(nil)).Elem()
}

func (i *SecurityProfile) ToSecurityProfileOutput() SecurityProfileOutput {
	return i.ToSecurityProfileOutputWithContext(context.Background())
}

func (i *SecurityProfile) ToSecurityProfileOutputWithContext(ctx context.Context) SecurityProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityProfileOutput)
}

// SecurityProfileArrayInput is an input type that accepts SecurityProfileArray and SecurityProfileArrayOutput values.
// You can construct a concrete instance of `SecurityProfileArrayInput` via:
//
//	SecurityProfileArray{ SecurityProfileArgs{...} }
type SecurityProfileArrayInput interface {
	pulumi.Input

	ToSecurityProfileArrayOutput() SecurityProfileArrayOutput
	ToSecurityProfileArrayOutputWithContext(context.Context) SecurityProfileArrayOutput
}

type SecurityProfileArray []SecurityProfileInput

func (SecurityProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityProfile)(nil)).Elem()
}

func (i SecurityProfileArray) ToSecurityProfileArrayOutput() SecurityProfileArrayOutput {
	return i.ToSecurityProfileArrayOutputWithContext(context.Background())
}

func (i SecurityProfileArray) ToSecurityProfileArrayOutputWithContext(ctx context.Context) SecurityProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityProfileArrayOutput)
}

// SecurityProfileMapInput is an input type that accepts SecurityProfileMap and SecurityProfileMapOutput values.
// You can construct a concrete instance of `SecurityProfileMapInput` via:
//
//	SecurityProfileMap{ "key": SecurityProfileArgs{...} }
type SecurityProfileMapInput interface {
	pulumi.Input

	ToSecurityProfileMapOutput() SecurityProfileMapOutput
	ToSecurityProfileMapOutputWithContext(context.Context) SecurityProfileMapOutput
}

type SecurityProfileMap map[string]SecurityProfileInput

func (SecurityProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityProfile)(nil)).Elem()
}

func (i SecurityProfileMap) ToSecurityProfileMapOutput() SecurityProfileMapOutput {
	return i.ToSecurityProfileMapOutputWithContext(context.Background())
}

func (i SecurityProfileMap) ToSecurityProfileMapOutputWithContext(ctx context.Context) SecurityProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityProfileMapOutput)
}

type SecurityProfileOutput struct{ *pulumi.OutputState }

func (SecurityProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityProfile)(nil)).Elem()
}

func (o SecurityProfileOutput) ToSecurityProfileOutput() SecurityProfileOutput {
	return o
}

func (o SecurityProfileOutput) ToSecurityProfileOutputWithContext(ctx context.Context) SecurityProfileOutput {
	return o
}

// The Amazon Resource Name (ARN) of the Security Profile.
func (o SecurityProfileOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specifies the description of the Security Profile.
func (o SecurityProfileOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies the identifier of the hosting Amazon Connect Instance.
func (o SecurityProfileOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// Specifies the name of the Security Profile.
func (o SecurityProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The organization resource identifier for the security profile.
func (o SecurityProfileOutput) OrganizationResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.OrganizationResourceId }).(pulumi.StringOutput)
}

// Specifies a list of permissions assigned to the security profile.
func (o SecurityProfileOutput) Permissions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringArrayOutput { return v.Permissions }).(pulumi.StringArrayOutput)
}

// The identifier for the Security Profile.
func (o SecurityProfileOutput) SecurityProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringOutput { return v.SecurityProfileId }).(pulumi.StringOutput)
}

// Tags to apply to the Security Profile. If configured with a provider
// `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o SecurityProfileOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o SecurityProfileOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SecurityProfile) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type SecurityProfileArrayOutput struct{ *pulumi.OutputState }

func (SecurityProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityProfile)(nil)).Elem()
}

func (o SecurityProfileArrayOutput) ToSecurityProfileArrayOutput() SecurityProfileArrayOutput {
	return o
}

func (o SecurityProfileArrayOutput) ToSecurityProfileArrayOutputWithContext(ctx context.Context) SecurityProfileArrayOutput {
	return o
}

func (o SecurityProfileArrayOutput) Index(i pulumi.IntInput) SecurityProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecurityProfile {
		return vs[0].([]*SecurityProfile)[vs[1].(int)]
	}).(SecurityProfileOutput)
}

type SecurityProfileMapOutput struct{ *pulumi.OutputState }

func (SecurityProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityProfile)(nil)).Elem()
}

func (o SecurityProfileMapOutput) ToSecurityProfileMapOutput() SecurityProfileMapOutput {
	return o
}

func (o SecurityProfileMapOutput) ToSecurityProfileMapOutputWithContext(ctx context.Context) SecurityProfileMapOutput {
	return o
}

func (o SecurityProfileMapOutput) MapIndex(k pulumi.StringInput) SecurityProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecurityProfile {
		return vs[0].(map[string]*SecurityProfile)[vs[1].(string)]
	}).(SecurityProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityProfileInput)(nil)).Elem(), &SecurityProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityProfileArrayInput)(nil)).Elem(), SecurityProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityProfileMapInput)(nil)).Elem(), SecurityProfileMap{})
	pulumi.RegisterOutputType(SecurityProfileOutput{})
	pulumi.RegisterOutputType(SecurityProfileArrayOutput{})
	pulumi.RegisterOutputType(SecurityProfileMapOutput{})
}
