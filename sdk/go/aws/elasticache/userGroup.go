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

// Provides an ElastiCache user group resource.
//
// ## Example Usage
//
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
//			testUser, err := elasticache.NewUser(ctx, "testUser", &elasticache.UserArgs{
//				UserId:       pulumi.String("testUserId"),
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
//			_, err = elasticache.NewUserGroup(ctx, "testUserGroup", &elasticache.UserGroupArgs{
//				Engine:      pulumi.String("REDIS"),
//				UserGroupId: pulumi.String("userGroupId"),
//				UserIds: pulumi.StringArray{
//					testUser.UserId,
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
// Using `pulumi import`, import ElastiCache user groups using the `user_group_id`. For example:
//
// ```sh
//
//	$ pulumi import aws:elasticache/userGroup:UserGroup my_user_group userGoupId1
//
// ```
type UserGroup struct {
	pulumi.CustomResourceState

	// The ARN that identifies the user group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The current supported value is `REDIS`.
	Engine pulumi.StringOutput `pulumi:"engine"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The ID of the user group.
	//
	// The following arguments are optional:
	UserGroupId pulumi.StringOutput `pulumi:"userGroupId"`
	// The list of user IDs that belong to the user group.
	UserIds pulumi.StringArrayOutput `pulumi:"userIds"`
}

// NewUserGroup registers a new resource with the given unique name, arguments, and options.
func NewUserGroup(ctx *pulumi.Context,
	name string, args *UserGroupArgs, opts ...pulumi.ResourceOption) (*UserGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Engine == nil {
		return nil, errors.New("invalid value for required argument 'Engine'")
	}
	if args.UserGroupId == nil {
		return nil, errors.New("invalid value for required argument 'UserGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserGroup
	err := ctx.RegisterResource("aws:elasticache/userGroup:UserGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserGroup gets an existing UserGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserGroupState, opts ...pulumi.ResourceOption) (*UserGroup, error) {
	var resource UserGroup
	err := ctx.ReadResource("aws:elasticache/userGroup:UserGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserGroup resources.
type userGroupState struct {
	// The ARN that identifies the user group.
	Arn *string `pulumi:"arn"`
	// The current supported value is `REDIS`.
	Engine *string `pulumi:"engine"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The ID of the user group.
	//
	// The following arguments are optional:
	UserGroupId *string `pulumi:"userGroupId"`
	// The list of user IDs that belong to the user group.
	UserIds []string `pulumi:"userIds"`
}

type UserGroupState struct {
	// The ARN that identifies the user group.
	Arn pulumi.StringPtrInput
	// The current supported value is `REDIS`.
	Engine pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The ID of the user group.
	//
	// The following arguments are optional:
	UserGroupId pulumi.StringPtrInput
	// The list of user IDs that belong to the user group.
	UserIds pulumi.StringArrayInput
}

func (UserGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*userGroupState)(nil)).Elem()
}

type userGroupArgs struct {
	// The current supported value is `REDIS`.
	Engine string `pulumi:"engine"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the user group.
	//
	// The following arguments are optional:
	UserGroupId string `pulumi:"userGroupId"`
	// The list of user IDs that belong to the user group.
	UserIds []string `pulumi:"userIds"`
}

// The set of arguments for constructing a UserGroup resource.
type UserGroupArgs struct {
	// The current supported value is `REDIS`.
	Engine pulumi.StringInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The ID of the user group.
	//
	// The following arguments are optional:
	UserGroupId pulumi.StringInput
	// The list of user IDs that belong to the user group.
	UserIds pulumi.StringArrayInput
}

func (UserGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userGroupArgs)(nil)).Elem()
}

type UserGroupInput interface {
	pulumi.Input

	ToUserGroupOutput() UserGroupOutput
	ToUserGroupOutputWithContext(ctx context.Context) UserGroupOutput
}

func (*UserGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGroup)(nil)).Elem()
}

func (i *UserGroup) ToUserGroupOutput() UserGroupOutput {
	return i.ToUserGroupOutputWithContext(context.Background())
}

func (i *UserGroup) ToUserGroupOutputWithContext(ctx context.Context) UserGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupOutput)
}

// UserGroupArrayInput is an input type that accepts UserGroupArray and UserGroupArrayOutput values.
// You can construct a concrete instance of `UserGroupArrayInput` via:
//
//	UserGroupArray{ UserGroupArgs{...} }
type UserGroupArrayInput interface {
	pulumi.Input

	ToUserGroupArrayOutput() UserGroupArrayOutput
	ToUserGroupArrayOutputWithContext(context.Context) UserGroupArrayOutput
}

type UserGroupArray []UserGroupInput

func (UserGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGroup)(nil)).Elem()
}

func (i UserGroupArray) ToUserGroupArrayOutput() UserGroupArrayOutput {
	return i.ToUserGroupArrayOutputWithContext(context.Background())
}

func (i UserGroupArray) ToUserGroupArrayOutputWithContext(ctx context.Context) UserGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupArrayOutput)
}

// UserGroupMapInput is an input type that accepts UserGroupMap and UserGroupMapOutput values.
// You can construct a concrete instance of `UserGroupMapInput` via:
//
//	UserGroupMap{ "key": UserGroupArgs{...} }
type UserGroupMapInput interface {
	pulumi.Input

	ToUserGroupMapOutput() UserGroupMapOutput
	ToUserGroupMapOutputWithContext(context.Context) UserGroupMapOutput
}

type UserGroupMap map[string]UserGroupInput

func (UserGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGroup)(nil)).Elem()
}

func (i UserGroupMap) ToUserGroupMapOutput() UserGroupMapOutput {
	return i.ToUserGroupMapOutputWithContext(context.Background())
}

func (i UserGroupMap) ToUserGroupMapOutputWithContext(ctx context.Context) UserGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserGroupMapOutput)
}

type UserGroupOutput struct{ *pulumi.OutputState }

func (UserGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserGroup)(nil)).Elem()
}

func (o UserGroupOutput) ToUserGroupOutput() UserGroupOutput {
	return o
}

func (o UserGroupOutput) ToUserGroupOutputWithContext(ctx context.Context) UserGroupOutput {
	return o
}

// The ARN that identifies the user group.
func (o UserGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The current supported value is `REDIS`.
func (o UserGroupOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringOutput { return v.Engine }).(pulumi.StringOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o UserGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o UserGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The ID of the user group.
//
// The following arguments are optional:
func (o UserGroupOutput) UserGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringOutput { return v.UserGroupId }).(pulumi.StringOutput)
}

// The list of user IDs that belong to the user group.
func (o UserGroupOutput) UserIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *UserGroup) pulumi.StringArrayOutput { return v.UserIds }).(pulumi.StringArrayOutput)
}

type UserGroupArrayOutput struct{ *pulumi.OutputState }

func (UserGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserGroup)(nil)).Elem()
}

func (o UserGroupArrayOutput) ToUserGroupArrayOutput() UserGroupArrayOutput {
	return o
}

func (o UserGroupArrayOutput) ToUserGroupArrayOutputWithContext(ctx context.Context) UserGroupArrayOutput {
	return o
}

func (o UserGroupArrayOutput) Index(i pulumi.IntInput) UserGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserGroup {
		return vs[0].([]*UserGroup)[vs[1].(int)]
	}).(UserGroupOutput)
}

type UserGroupMapOutput struct{ *pulumi.OutputState }

func (UserGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserGroup)(nil)).Elem()
}

func (o UserGroupMapOutput) ToUserGroupMapOutput() UserGroupMapOutput {
	return o
}

func (o UserGroupMapOutput) ToUserGroupMapOutputWithContext(ctx context.Context) UserGroupMapOutput {
	return o
}

func (o UserGroupMapOutput) MapIndex(k pulumi.StringInput) UserGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserGroup {
		return vs[0].(map[string]*UserGroup)[vs[1].(string)]
	}).(UserGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupInput)(nil)).Elem(), &UserGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupArrayInput)(nil)).Elem(), UserGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserGroupMapInput)(nil)).Elem(), UserGroupMap{})
	pulumi.RegisterOutputType(UserGroupOutput{})
	pulumi.RegisterOutputType(UserGroupArrayOutput{})
	pulumi.RegisterOutputType(UserGroupMapOutput{})
}
