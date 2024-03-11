// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package elasticache

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Associate an existing ElastiCache user and an existing user group.
//
// > **NOTE:** The provider will detect changes in the `elasticache.UserGroup` since `elasticache.UserGroupAssociation` changes the user IDs associated with the user group. You can ignore these changes with the `ignoreChanges` option as shown in the example.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/elasticache"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := elasticache.NewUser(ctx, "default", &elasticache.UserArgs{
//				UserId:       pulumi.String("defaultUserID"),
//				UserName:     pulumi.String("default"),
//				AccessString: pulumi.String("on ~app::* -@all +@read +@hash +@bitmap +@geo -setbit -bitfield -hset -hsetnx -hmset -hincrby -hincrbyfloat -hdel -bitop -geoadd -georadius -georadiusbymember"),
//				Engine:       pulumi.String("REDIS"),
//				Passwords: pulumi.StringArray{
//					pulumi.String("password123456789"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			example, err := elasticache.NewUserGroup(ctx, "example", &elasticache.UserGroupArgs{
//				Engine:      pulumi.String("REDIS"),
//				UserGroupId: pulumi.String("userGroupId"),
//				UserIds: pulumi.StringArray{
//					_default.UserId,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleUser, err := elasticache.NewUser(ctx, "example", &elasticache.UserArgs{
//				UserId:       pulumi.String("exampleUserID"),
//				UserName:     pulumi.String("exampleuser"),
//				AccessString: pulumi.String("on ~app::* -@all +@read +@hash +@bitmap +@geo -setbit -bitfield -hset -hsetnx -hmset -hincrby -hincrbyfloat -hdel -bitop -geoadd -georadius -georadiusbymember"),
//				Engine:       pulumi.String("REDIS"),
//				Passwords: pulumi.StringArray{
//					pulumi.String("password123456789"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = elasticache.NewUserGroupAssociation(ctx, "example", &elasticache.UserGroupAssociationArgs{
//				UserGroupId: example.UserGroupId,
//				UserId:      exampleUser.UserId,
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
// Using `pulumi import`, import ElastiCache user group associations using the `user_group_id` and `user_id`. For example:
//
// ```sh
// $ pulumi import aws:elasticache/userGroupAssociation:UserGroupAssociation example userGoupId1,userId
// ```
type UserGroupAssociation struct {
	pulumi.CustomResourceState

	// ID of the user group.
	UserGroupId pulumi.StringOutput `pulumi:"userGroupId"`
	// ID of the user to associated with the user group.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserGroupAssociation registers a new resource with the given unique name, arguments, and options.
func NewUserGroupAssociation(ctx *pulumi.Context,
	name string, args *UserGroupAssociationArgs, opts ...pulumi.ResourceOption) (*UserGroupAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.UserGroupId == nil {
		return nil, errors.New("invalid value for required argument 'UserGroupId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserGroupAssociation
	err := ctx.RegisterResource("aws:elasticache/userGroupAssociation:UserGroupAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserGroupAssociation gets an existing UserGroupAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserGroupAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserGroupAssociationState, opts ...pulumi.ResourceOption) (*UserGroupAssociation, error) {
	var resource UserGroupAssociation
	err := ctx.ReadResource("aws:elasticache/userGroupAssociation:UserGroupAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserGroupAssociation resources.
type userGroupAssociationState struct {
	// ID of the user group.
	UserGroupId *string `pulumi:"userGroupId"`
	// ID of the user to associated with the user group.
	UserId *string `pulumi:"userId"`
}

type UserGroupAssociationState struct {
	// ID of the user group.
	UserGroupId pulumi.StringPtrInput
	// ID of the user to associated with the user group.
	UserId pulumi.StringPtrInput
}

func (UserGroupAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*userGroupAssociationState)(nil)).Elem()
}

type userGroupAssociationArgs struct {
	// ID of the user group.
	UserGroupId string `pulumi:"userGroupId"`
	// ID of the user to associated with the user group.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserGroupAssociation resource.
type UserGroupAssociationArgs struct {
	// ID of the user group.
	UserGroupId pulumi.StringInput
	// ID of the user to associated with the user group.
	UserId pulumi.StringInput
}

func (UserGroupAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userGroupAssociationArgs)(nil)).Elem()
}

type UserGroupAssociationInput interface {
	pulumi.Input

	ToUserGroupAssociationOutput() UserGroupAssociationOutput
	ToUserGroupAssociationOutputWithContext(ctx context.Context) UserGroupAssociationOutput
}

func (*UserGroupAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGroupAssociation)(nil)).Elem()
}

func (i *UserGroupAssociation) ToUserGroupAssociationOutput() UserGroupAssociationOutput {
	return i.ToUserGroupAssociationOutputWithContext(context.Background())
}

func (i *UserGroupAssociation) ToUserGroupAssociationOutputWithContext(ctx context.Context) UserGroupAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupAssociationOutput)
}

// UserGroupAssociationArrayInput is an input type that accepts UserGroupAssociationArray and UserGroupAssociationArrayOutput values.
// You can construct a concrete instance of `UserGroupAssociationArrayInput` via:
//
//	UserGroupAssociationArray{ UserGroupAssociationArgs{...} }
type UserGroupAssociationArrayInput interface {
	pulumi.Input

	ToUserGroupAssociationArrayOutput() UserGroupAssociationArrayOutput
	ToUserGroupAssociationArrayOutputWithContext(context.Context) UserGroupAssociationArrayOutput
}

type UserGroupAssociationArray []UserGroupAssociationInput

func (UserGroupAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGroupAssociation)(nil)).Elem()
}

func (i UserGroupAssociationArray) ToUserGroupAssociationArrayOutput() UserGroupAssociationArrayOutput {
	return i.ToUserGroupAssociationArrayOutputWithContext(context.Background())
}

func (i UserGroupAssociationArray) ToUserGroupAssociationArrayOutputWithContext(ctx context.Context) UserGroupAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupAssociationArrayOutput)
}

// UserGroupAssociationMapInput is an input type that accepts UserGroupAssociationMap and UserGroupAssociationMapOutput values.
// You can construct a concrete instance of `UserGroupAssociationMapInput` via:
//
//	UserGroupAssociationMap{ "key": UserGroupAssociationArgs{...} }
type UserGroupAssociationMapInput interface {
	pulumi.Input

	ToUserGroupAssociationMapOutput() UserGroupAssociationMapOutput
	ToUserGroupAssociationMapOutputWithContext(context.Context) UserGroupAssociationMapOutput
}

type UserGroupAssociationMap map[string]UserGroupAssociationInput

func (UserGroupAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGroupAssociation)(nil)).Elem()
}

func (i UserGroupAssociationMap) ToUserGroupAssociationMapOutput() UserGroupAssociationMapOutput {
	return i.ToUserGroupAssociationMapOutputWithContext(context.Background())
}

func (i UserGroupAssociationMap) ToUserGroupAssociationMapOutputWithContext(ctx context.Context) UserGroupAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupAssociationMapOutput)
}

type UserGroupAssociationOutput struct{ *pulumi.OutputState }

func (UserGroupAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGroupAssociation)(nil)).Elem()
}

func (o UserGroupAssociationOutput) ToUserGroupAssociationOutput() UserGroupAssociationOutput {
	return o
}

func (o UserGroupAssociationOutput) ToUserGroupAssociationOutputWithContext(ctx context.Context) UserGroupAssociationOutput {
	return o
}

// ID of the user group.
func (o UserGroupAssociationOutput) UserGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGroupAssociation) pulumi.StringOutput { return v.UserGroupId }).(pulumi.StringOutput)
}

// ID of the user to associated with the user group.
func (o UserGroupAssociationOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGroupAssociation) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserGroupAssociationArrayOutput struct{ *pulumi.OutputState }

func (UserGroupAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGroupAssociation)(nil)).Elem()
}

func (o UserGroupAssociationArrayOutput) ToUserGroupAssociationArrayOutput() UserGroupAssociationArrayOutput {
	return o
}

func (o UserGroupAssociationArrayOutput) ToUserGroupAssociationArrayOutputWithContext(ctx context.Context) UserGroupAssociationArrayOutput {
	return o
}

func (o UserGroupAssociationArrayOutput) Index(i pulumi.IntInput) UserGroupAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserGroupAssociation {
		return vs[0].([]*UserGroupAssociation)[vs[1].(int)]
	}).(UserGroupAssociationOutput)
}

type UserGroupAssociationMapOutput struct{ *pulumi.OutputState }

func (UserGroupAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGroupAssociation)(nil)).Elem()
}

func (o UserGroupAssociationMapOutput) ToUserGroupAssociationMapOutput() UserGroupAssociationMapOutput {
	return o
}

func (o UserGroupAssociationMapOutput) ToUserGroupAssociationMapOutputWithContext(ctx context.Context) UserGroupAssociationMapOutput {
	return o
}

func (o UserGroupAssociationMapOutput) MapIndex(k pulumi.StringInput) UserGroupAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserGroupAssociation {
		return vs[0].(map[string]*UserGroupAssociation)[vs[1].(string)]
	}).(UserGroupAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupAssociationInput)(nil)).Elem(), &UserGroupAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupAssociationArrayInput)(nil)).Elem(), UserGroupAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupAssociationMapInput)(nil)).Elem(), UserGroupAssociationMap{})
	pulumi.RegisterOutputType(UserGroupAssociationOutput{})
	pulumi.RegisterOutputType(UserGroupAssociationArrayOutput{})
	pulumi.RegisterOutputType(UserGroupAssociationMapOutput{})
}
