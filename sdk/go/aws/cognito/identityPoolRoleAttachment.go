// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cognito

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Cognito Identity Pool Roles Attachment.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cognito"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iam"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		mainIdentityPool, err := cognito.NewIdentityPool(ctx, "mainIdentityPool", &cognito.IdentityPoolArgs{
// 			IdentityPoolName:               pulumi.String("identity pool"),
// 			AllowUnauthenticatedIdentities: pulumi.Bool(false),
// 			SupportedLoginProviders: pulumi.StringMap{
// 				"graph.facebook.com": pulumi.String("7346241598935555"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		authenticatedRole, err := iam.NewRole(ctx, "authenticatedRole", &iam.RoleArgs{
// 			AssumeRolePolicy: mainIdentityPool.ID().ApplyT(func(id string) (string, error) {
// 				return fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Effect\": \"Allow\",\n", "      \"Principal\": {\n", "        \"Federated\": \"cognito-identity.amazonaws.com\"\n", "      },\n", "      \"Action\": \"sts:AssumeRoleWithWebIdentity\",\n", "      \"Condition\": {\n", "        \"StringEquals\": {\n", "          \"cognito-identity.amazonaws.com:aud\": \"", id, "\"\n", "        },\n", "        \"ForAnyValue:StringLike\": {\n", "          \"cognito-identity.amazonaws.com:amr\": \"authenticated\"\n", "        }\n", "      }\n", "    }\n", "  ]\n", "}\n"), nil
// 			}).(pulumi.StringOutput),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = iam.NewRolePolicy(ctx, "authenticatedRolePolicy", &iam.RolePolicyArgs{
// 			Role:   authenticatedRole.ID(),
// 			Policy: pulumi.Any(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Effect\": \"Allow\",\n", "      \"Action\": [\n", "        \"mobileanalytics:PutEvents\",\n", "        \"cognito-sync:*\",\n", "        \"cognito-identity:*\"\n", "      ],\n", "      \"Resource\": [\n", "        \"*\"\n", "      ]\n", "    }\n", "  ]\n", "}\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cognito.NewIdentityPoolRoleAttachment(ctx, "mainIdentityPoolRoleAttachment", &cognito.IdentityPoolRoleAttachmentArgs{
// 			IdentityPoolId: mainIdentityPool.ID(),
// 			RoleMappings: cognito.IdentityPoolRoleAttachmentRoleMappingArray{
// 				&cognito.IdentityPoolRoleAttachmentRoleMappingArgs{
// 					IdentityProvider:        pulumi.String("graph.facebook.com"),
// 					AmbiguousRoleResolution: pulumi.String("AuthenticatedRole"),
// 					Type:                    pulumi.String("Rules"),
// 					MappingRules: cognito.IdentityPoolRoleAttachmentRoleMappingMappingRuleArray{
// 						&cognito.IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs{
// 							Claim:     pulumi.String("isAdmin"),
// 							MatchType: pulumi.String("Equals"),
// 							RoleArn:   authenticatedRole.Arn,
// 							Value:     pulumi.String("paid"),
// 						},
// 					},
// 				},
// 			},
// 			Roles: pulumi.StringMap{
// 				"authenticated": authenticatedRole.Arn,
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Cognito Identity Pool Roles Attachment can be imported using the Identity Pool ID, e.g.,
//
// ```sh
//  $ pulumi import aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment example us-west-2_abc123
// ```
type IdentityPoolRoleAttachment struct {
	pulumi.CustomResourceState

	// An identity pool ID in the format `REGION_GUID`.
	IdentityPoolId pulumi.StringOutput `pulumi:"identityPoolId"`
	// A List of Role Mapping.
	RoleMappings IdentityPoolRoleAttachmentRoleMappingArrayOutput `pulumi:"roleMappings"`
	// The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
	Roles pulumi.StringMapOutput `pulumi:"roles"`
}

// NewIdentityPoolRoleAttachment registers a new resource with the given unique name, arguments, and options.
func NewIdentityPoolRoleAttachment(ctx *pulumi.Context,
	name string, args *IdentityPoolRoleAttachmentArgs, opts ...pulumi.ResourceOption) (*IdentityPoolRoleAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IdentityPoolId == nil {
		return nil, errors.New("invalid value for required argument 'IdentityPoolId'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	var resource IdentityPoolRoleAttachment
	err := ctx.RegisterResource("aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIdentityPoolRoleAttachment gets an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIdentityPoolRoleAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IdentityPoolRoleAttachmentState, opts ...pulumi.ResourceOption) (*IdentityPoolRoleAttachment, error) {
	var resource IdentityPoolRoleAttachment
	err := ctx.ReadResource("aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IdentityPoolRoleAttachment resources.
type identityPoolRoleAttachmentState struct {
	// An identity pool ID in the format `REGION_GUID`.
	IdentityPoolId *string `pulumi:"identityPoolId"`
	// A List of Role Mapping.
	RoleMappings []IdentityPoolRoleAttachmentRoleMapping `pulumi:"roleMappings"`
	// The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
	Roles map[string]string `pulumi:"roles"`
}

type IdentityPoolRoleAttachmentState struct {
	// An identity pool ID in the format `REGION_GUID`.
	IdentityPoolId pulumi.StringPtrInput
	// A List of Role Mapping.
	RoleMappings IdentityPoolRoleAttachmentRoleMappingArrayInput
	// The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
	Roles pulumi.StringMapInput
}

func (IdentityPoolRoleAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*identityPoolRoleAttachmentState)(nil)).Elem()
}

type identityPoolRoleAttachmentArgs struct {
	// An identity pool ID in the format `REGION_GUID`.
	IdentityPoolId string `pulumi:"identityPoolId"`
	// A List of Role Mapping.
	RoleMappings []IdentityPoolRoleAttachmentRoleMapping `pulumi:"roleMappings"`
	// The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
	Roles map[string]string `pulumi:"roles"`
}

// The set of arguments for constructing a IdentityPoolRoleAttachment resource.
type IdentityPoolRoleAttachmentArgs struct {
	// An identity pool ID in the format `REGION_GUID`.
	IdentityPoolId pulumi.StringInput
	// A List of Role Mapping.
	RoleMappings IdentityPoolRoleAttachmentRoleMappingArrayInput
	// The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
	Roles pulumi.StringMapInput
}

func (IdentityPoolRoleAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*identityPoolRoleAttachmentArgs)(nil)).Elem()
}

type IdentityPoolRoleAttachmentInput interface {
	pulumi.Input

	ToIdentityPoolRoleAttachmentOutput() IdentityPoolRoleAttachmentOutput
	ToIdentityPoolRoleAttachmentOutputWithContext(ctx context.Context) IdentityPoolRoleAttachmentOutput
}

func (*IdentityPoolRoleAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityPoolRoleAttachment)(nil)).Elem()
}

func (i *IdentityPoolRoleAttachment) ToIdentityPoolRoleAttachmentOutput() IdentityPoolRoleAttachmentOutput {
	return i.ToIdentityPoolRoleAttachmentOutputWithContext(context.Background())
}

func (i *IdentityPoolRoleAttachment) ToIdentityPoolRoleAttachmentOutputWithContext(ctx context.Context) IdentityPoolRoleAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityPoolRoleAttachmentOutput)
}

// IdentityPoolRoleAttachmentArrayInput is an input type that accepts IdentityPoolRoleAttachmentArray and IdentityPoolRoleAttachmentArrayOutput values.
// You can construct a concrete instance of `IdentityPoolRoleAttachmentArrayInput` via:
//
//          IdentityPoolRoleAttachmentArray{ IdentityPoolRoleAttachmentArgs{...} }
type IdentityPoolRoleAttachmentArrayInput interface {
	pulumi.Input

	ToIdentityPoolRoleAttachmentArrayOutput() IdentityPoolRoleAttachmentArrayOutput
	ToIdentityPoolRoleAttachmentArrayOutputWithContext(context.Context) IdentityPoolRoleAttachmentArrayOutput
}

type IdentityPoolRoleAttachmentArray []IdentityPoolRoleAttachmentInput

func (IdentityPoolRoleAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityPoolRoleAttachment)(nil)).Elem()
}

func (i IdentityPoolRoleAttachmentArray) ToIdentityPoolRoleAttachmentArrayOutput() IdentityPoolRoleAttachmentArrayOutput {
	return i.ToIdentityPoolRoleAttachmentArrayOutputWithContext(context.Background())
}

func (i IdentityPoolRoleAttachmentArray) ToIdentityPoolRoleAttachmentArrayOutputWithContext(ctx context.Context) IdentityPoolRoleAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityPoolRoleAttachmentArrayOutput)
}

// IdentityPoolRoleAttachmentMapInput is an input type that accepts IdentityPoolRoleAttachmentMap and IdentityPoolRoleAttachmentMapOutput values.
// You can construct a concrete instance of `IdentityPoolRoleAttachmentMapInput` via:
//
//          IdentityPoolRoleAttachmentMap{ "key": IdentityPoolRoleAttachmentArgs{...} }
type IdentityPoolRoleAttachmentMapInput interface {
	pulumi.Input

	ToIdentityPoolRoleAttachmentMapOutput() IdentityPoolRoleAttachmentMapOutput
	ToIdentityPoolRoleAttachmentMapOutputWithContext(context.Context) IdentityPoolRoleAttachmentMapOutput
}

type IdentityPoolRoleAttachmentMap map[string]IdentityPoolRoleAttachmentInput

func (IdentityPoolRoleAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityPoolRoleAttachment)(nil)).Elem()
}

func (i IdentityPoolRoleAttachmentMap) ToIdentityPoolRoleAttachmentMapOutput() IdentityPoolRoleAttachmentMapOutput {
	return i.ToIdentityPoolRoleAttachmentMapOutputWithContext(context.Background())
}

func (i IdentityPoolRoleAttachmentMap) ToIdentityPoolRoleAttachmentMapOutputWithContext(ctx context.Context) IdentityPoolRoleAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityPoolRoleAttachmentMapOutput)
}

type IdentityPoolRoleAttachmentOutput struct{ *pulumi.OutputState }

func (IdentityPoolRoleAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityPoolRoleAttachment)(nil)).Elem()
}

func (o IdentityPoolRoleAttachmentOutput) ToIdentityPoolRoleAttachmentOutput() IdentityPoolRoleAttachmentOutput {
	return o
}

func (o IdentityPoolRoleAttachmentOutput) ToIdentityPoolRoleAttachmentOutputWithContext(ctx context.Context) IdentityPoolRoleAttachmentOutput {
	return o
}

type IdentityPoolRoleAttachmentArrayOutput struct{ *pulumi.OutputState }

func (IdentityPoolRoleAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityPoolRoleAttachment)(nil)).Elem()
}

func (o IdentityPoolRoleAttachmentArrayOutput) ToIdentityPoolRoleAttachmentArrayOutput() IdentityPoolRoleAttachmentArrayOutput {
	return o
}

func (o IdentityPoolRoleAttachmentArrayOutput) ToIdentityPoolRoleAttachmentArrayOutputWithContext(ctx context.Context) IdentityPoolRoleAttachmentArrayOutput {
	return o
}

func (o IdentityPoolRoleAttachmentArrayOutput) Index(i pulumi.IntInput) IdentityPoolRoleAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IdentityPoolRoleAttachment {
		return vs[0].([]*IdentityPoolRoleAttachment)[vs[1].(int)]
	}).(IdentityPoolRoleAttachmentOutput)
}

type IdentityPoolRoleAttachmentMapOutput struct{ *pulumi.OutputState }

func (IdentityPoolRoleAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityPoolRoleAttachment)(nil)).Elem()
}

func (o IdentityPoolRoleAttachmentMapOutput) ToIdentityPoolRoleAttachmentMapOutput() IdentityPoolRoleAttachmentMapOutput {
	return o
}

func (o IdentityPoolRoleAttachmentMapOutput) ToIdentityPoolRoleAttachmentMapOutputWithContext(ctx context.Context) IdentityPoolRoleAttachmentMapOutput {
	return o
}

func (o IdentityPoolRoleAttachmentMapOutput) MapIndex(k pulumi.StringInput) IdentityPoolRoleAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IdentityPoolRoleAttachment {
		return vs[0].(map[string]*IdentityPoolRoleAttachment)[vs[1].(string)]
	}).(IdentityPoolRoleAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityPoolRoleAttachmentInput)(nil)).Elem(), &IdentityPoolRoleAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityPoolRoleAttachmentArrayInput)(nil)).Elem(), IdentityPoolRoleAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityPoolRoleAttachmentMapInput)(nil)).Elem(), IdentityPoolRoleAttachmentMap{})
	pulumi.RegisterOutputType(IdentityPoolRoleAttachmentOutput{})
	pulumi.RegisterOutputType(IdentityPoolRoleAttachmentArrayOutput{})
	pulumi.RegisterOutputType(IdentityPoolRoleAttachmentMapOutput{})
}
