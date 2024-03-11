// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon Managed Grafana workspace role association resource.
//
// ## Example Usage
//
// ### Basic configuration
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/grafana"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"version": "2012-10-17",
//				"statement": []map[string]interface{}{
//					map[string]interface{}{
//						"action": "sts:AssumeRole",
//						"effect": "Allow",
//						"sid":    "",
//						"principal": map[string]interface{}{
//							"service": "grafana.amazonaws.com",
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			assume, err := iam.NewRole(ctx, "assume", &iam.RoleArgs{
//				Name:             pulumi.String("grafana-assume"),
//				AssumeRolePolicy: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			exampleWorkspace, err := grafana.NewWorkspace(ctx, "example", &grafana.WorkspaceArgs{
//				AccountAccessType: pulumi.String("CURRENT_ACCOUNT"),
//				AuthenticationProviders: pulumi.StringArray{
//					pulumi.String("SAML"),
//				},
//				PermissionType: pulumi.String("SERVICE_MANAGED"),
//				RoleArn:        assume.Arn,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = grafana.NewRoleAssociation(ctx, "example", &grafana.RoleAssociationArgs{
//				Role: pulumi.String("ADMIN"),
//				UserIds: pulumi.StringArray{
//					pulumi.String("USER_ID_1"),
//					pulumi.String("USER_ID_2"),
//				},
//				WorkspaceId: exampleWorkspace.ID(),
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
type RoleAssociation struct {
	pulumi.CustomResourceState

	// The AWS SSO group ids to be assigned the role given in `role`.
	GroupIds pulumi.StringArrayOutput `pulumi:"groupIds"`
	// The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
	Role pulumi.StringOutput `pulumi:"role"`
	// The AWS SSO user ids to be assigned the role given in `role`.
	UserIds pulumi.StringArrayOutput `pulumi:"userIds"`
	// The workspace id.
	//
	// The following arguments are optional:
	WorkspaceId pulumi.StringOutput `pulumi:"workspaceId"`
}

// NewRoleAssociation registers a new resource with the given unique name, arguments, and options.
func NewRoleAssociation(ctx *pulumi.Context,
	name string, args *RoleAssociationArgs, opts ...pulumi.ResourceOption) (*RoleAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RoleAssociation
	err := ctx.RegisterResource("aws:grafana/roleAssociation:RoleAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoleAssociation gets an existing RoleAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoleAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleAssociationState, opts ...pulumi.ResourceOption) (*RoleAssociation, error) {
	var resource RoleAssociation
	err := ctx.ReadResource("aws:grafana/roleAssociation:RoleAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoleAssociation resources.
type roleAssociationState struct {
	// The AWS SSO group ids to be assigned the role given in `role`.
	GroupIds []string `pulumi:"groupIds"`
	// The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
	Role *string `pulumi:"role"`
	// The AWS SSO user ids to be assigned the role given in `role`.
	UserIds []string `pulumi:"userIds"`
	// The workspace id.
	//
	// The following arguments are optional:
	WorkspaceId *string `pulumi:"workspaceId"`
}

type RoleAssociationState struct {
	// The AWS SSO group ids to be assigned the role given in `role`.
	GroupIds pulumi.StringArrayInput
	// The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
	Role pulumi.StringPtrInput
	// The AWS SSO user ids to be assigned the role given in `role`.
	UserIds pulumi.StringArrayInput
	// The workspace id.
	//
	// The following arguments are optional:
	WorkspaceId pulumi.StringPtrInput
}

func (RoleAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleAssociationState)(nil)).Elem()
}

type roleAssociationArgs struct {
	// The AWS SSO group ids to be assigned the role given in `role`.
	GroupIds []string `pulumi:"groupIds"`
	// The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
	Role string `pulumi:"role"`
	// The AWS SSO user ids to be assigned the role given in `role`.
	UserIds []string `pulumi:"userIds"`
	// The workspace id.
	//
	// The following arguments are optional:
	WorkspaceId string `pulumi:"workspaceId"`
}

// The set of arguments for constructing a RoleAssociation resource.
type RoleAssociationArgs struct {
	// The AWS SSO group ids to be assigned the role given in `role`.
	GroupIds pulumi.StringArrayInput
	// The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
	Role pulumi.StringInput
	// The AWS SSO user ids to be assigned the role given in `role`.
	UserIds pulumi.StringArrayInput
	// The workspace id.
	//
	// The following arguments are optional:
	WorkspaceId pulumi.StringInput
}

func (RoleAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleAssociationArgs)(nil)).Elem()
}

type RoleAssociationInput interface {
	pulumi.Input

	ToRoleAssociationOutput() RoleAssociationOutput
	ToRoleAssociationOutputWithContext(ctx context.Context) RoleAssociationOutput
}

func (*RoleAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleAssociation)(nil)).Elem()
}

func (i *RoleAssociation) ToRoleAssociationOutput() RoleAssociationOutput {
	return i.ToRoleAssociationOutputWithContext(context.Background())
}

func (i *RoleAssociation) ToRoleAssociationOutputWithContext(ctx context.Context) RoleAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleAssociationOutput)
}

// RoleAssociationArrayInput is an input type that accepts RoleAssociationArray and RoleAssociationArrayOutput values.
// You can construct a concrete instance of `RoleAssociationArrayInput` via:
//
//	RoleAssociationArray{ RoleAssociationArgs{...} }
type RoleAssociationArrayInput interface {
	pulumi.Input

	ToRoleAssociationArrayOutput() RoleAssociationArrayOutput
	ToRoleAssociationArrayOutputWithContext(context.Context) RoleAssociationArrayOutput
}

type RoleAssociationArray []RoleAssociationInput

func (RoleAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleAssociation)(nil)).Elem()
}

func (i RoleAssociationArray) ToRoleAssociationArrayOutput() RoleAssociationArrayOutput {
	return i.ToRoleAssociationArrayOutputWithContext(context.Background())
}

func (i RoleAssociationArray) ToRoleAssociationArrayOutputWithContext(ctx context.Context) RoleAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleAssociationArrayOutput)
}

// RoleAssociationMapInput is an input type that accepts RoleAssociationMap and RoleAssociationMapOutput values.
// You can construct a concrete instance of `RoleAssociationMapInput` via:
//
//	RoleAssociationMap{ "key": RoleAssociationArgs{...} }
type RoleAssociationMapInput interface {
	pulumi.Input

	ToRoleAssociationMapOutput() RoleAssociationMapOutput
	ToRoleAssociationMapOutputWithContext(context.Context) RoleAssociationMapOutput
}

type RoleAssociationMap map[string]RoleAssociationInput

func (RoleAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleAssociation)(nil)).Elem()
}

func (i RoleAssociationMap) ToRoleAssociationMapOutput() RoleAssociationMapOutput {
	return i.ToRoleAssociationMapOutputWithContext(context.Background())
}

func (i RoleAssociationMap) ToRoleAssociationMapOutputWithContext(ctx context.Context) RoleAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleAssociationMapOutput)
}

type RoleAssociationOutput struct{ *pulumi.OutputState }

func (RoleAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleAssociation)(nil)).Elem()
}

func (o RoleAssociationOutput) ToRoleAssociationOutput() RoleAssociationOutput {
	return o
}

func (o RoleAssociationOutput) ToRoleAssociationOutputWithContext(ctx context.Context) RoleAssociationOutput {
	return o
}

// The AWS SSO group ids to be assigned the role given in `role`.
func (o RoleAssociationOutput) GroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RoleAssociation) pulumi.StringArrayOutput { return v.GroupIds }).(pulumi.StringArrayOutput)
}

// The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
func (o RoleAssociationOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleAssociation) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// The AWS SSO user ids to be assigned the role given in `role`.
func (o RoleAssociationOutput) UserIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RoleAssociation) pulumi.StringArrayOutput { return v.UserIds }).(pulumi.StringArrayOutput)
}

// The workspace id.
//
// The following arguments are optional:
func (o RoleAssociationOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleAssociation) pulumi.StringOutput { return v.WorkspaceId }).(pulumi.StringOutput)
}

type RoleAssociationArrayOutput struct{ *pulumi.OutputState }

func (RoleAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleAssociation)(nil)).Elem()
}

func (o RoleAssociationArrayOutput) ToRoleAssociationArrayOutput() RoleAssociationArrayOutput {
	return o
}

func (o RoleAssociationArrayOutput) ToRoleAssociationArrayOutputWithContext(ctx context.Context) RoleAssociationArrayOutput {
	return o
}

func (o RoleAssociationArrayOutput) Index(i pulumi.IntInput) RoleAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RoleAssociation {
		return vs[0].([]*RoleAssociation)[vs[1].(int)]
	}).(RoleAssociationOutput)
}

type RoleAssociationMapOutput struct{ *pulumi.OutputState }

func (RoleAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleAssociation)(nil)).Elem()
}

func (o RoleAssociationMapOutput) ToRoleAssociationMapOutput() RoleAssociationMapOutput {
	return o
}

func (o RoleAssociationMapOutput) ToRoleAssociationMapOutputWithContext(ctx context.Context) RoleAssociationMapOutput {
	return o
}

func (o RoleAssociationMapOutput) MapIndex(k pulumi.StringInput) RoleAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RoleAssociation {
		return vs[0].(map[string]*RoleAssociation)[vs[1].(string)]
	}).(RoleAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoleAssociationInput)(nil)).Elem(), &RoleAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleAssociationArrayInput)(nil)).Elem(), RoleAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleAssociationMapInput)(nil)).Elem(), RoleAssociationMap{})
	pulumi.RegisterOutputType(RoleAssociationOutput{})
	pulumi.RegisterOutputType(RoleAssociationArrayOutput{})
	pulumi.RegisterOutputType(RoleAssociationMapOutput{})
}
