// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bedrock

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Agents for Amazon Bedrock Agent Alias.
//
// ## Example Usage
//
// ## Import
//
// Using `pulumi import`, import Agents for Amazon Bedrock Agent Alias using the alias ID and the agent ID separated by `,`. For example:
//
// ```sh
// $ pulumi import aws:bedrock/agentAgentAlias:AgentAgentAlias example 66IVY0GUTF,GGRRAED6JP
// ```
type AgentAgentAlias struct {
	pulumi.CustomResourceState

	// ARN of the alias.
	AgentAliasArn pulumi.StringOutput `pulumi:"agentAliasArn"`
	// Unique identifier of the alias.
	AgentAliasId pulumi.StringOutput `pulumi:"agentAliasId"`
	// Name of the alias.
	AgentAliasName pulumi.StringOutput `pulumi:"agentAliasName"`
	// Identifier of the agent to create an alias for.
	//
	// The following arguments are optional:
	AgentId pulumi.StringOutput `pulumi:"agentId"`
	// Description of the alias.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Details about the routing configuration of the alias. See `routingConfiguration` block for details.
	RoutingConfigurations AgentAgentAliasRoutingConfigurationArrayOutput `pulumi:"routingConfigurations"`
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapOutput           `pulumi:"tagsAll"`
	Timeouts AgentAgentAliasTimeoutsPtrOutput `pulumi:"timeouts"`
}

// NewAgentAgentAlias registers a new resource with the given unique name, arguments, and options.
func NewAgentAgentAlias(ctx *pulumi.Context,
	name string, args *AgentAgentAliasArgs, opts ...pulumi.ResourceOption) (*AgentAgentAlias, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AgentAliasName == nil {
		return nil, errors.New("invalid value for required argument 'AgentAliasName'")
	}
	if args.AgentId == nil {
		return nil, errors.New("invalid value for required argument 'AgentId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AgentAgentAlias
	err := ctx.RegisterResource("aws:bedrock/agentAgentAlias:AgentAgentAlias", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAgentAgentAlias gets an existing AgentAgentAlias resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAgentAgentAlias(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AgentAgentAliasState, opts ...pulumi.ResourceOption) (*AgentAgentAlias, error) {
	var resource AgentAgentAlias
	err := ctx.ReadResource("aws:bedrock/agentAgentAlias:AgentAgentAlias", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AgentAgentAlias resources.
type agentAgentAliasState struct {
	// ARN of the alias.
	AgentAliasArn *string `pulumi:"agentAliasArn"`
	// Unique identifier of the alias.
	AgentAliasId *string `pulumi:"agentAliasId"`
	// Name of the alias.
	AgentAliasName *string `pulumi:"agentAliasName"`
	// Identifier of the agent to create an alias for.
	//
	// The following arguments are optional:
	AgentId *string `pulumi:"agentId"`
	// Description of the alias.
	Description *string `pulumi:"description"`
	// Details about the routing configuration of the alias. See `routingConfiguration` block for details.
	RoutingConfigurations []AgentAgentAliasRoutingConfiguration `pulumi:"routingConfigurations"`
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  map[string]string        `pulumi:"tagsAll"`
	Timeouts *AgentAgentAliasTimeouts `pulumi:"timeouts"`
}

type AgentAgentAliasState struct {
	// ARN of the alias.
	AgentAliasArn pulumi.StringPtrInput
	// Unique identifier of the alias.
	AgentAliasId pulumi.StringPtrInput
	// Name of the alias.
	AgentAliasName pulumi.StringPtrInput
	// Identifier of the agent to create an alias for.
	//
	// The following arguments are optional:
	AgentId pulumi.StringPtrInput
	// Description of the alias.
	Description pulumi.StringPtrInput
	// Details about the routing configuration of the alias. See `routingConfiguration` block for details.
	RoutingConfigurations AgentAgentAliasRoutingConfigurationArrayInput
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapInput
	Timeouts AgentAgentAliasTimeoutsPtrInput
}

func (AgentAgentAliasState) ElementType() reflect.Type {
	return reflect.TypeOf((*agentAgentAliasState)(nil)).Elem()
}

type agentAgentAliasArgs struct {
	// Name of the alias.
	AgentAliasName string `pulumi:"agentAliasName"`
	// Identifier of the agent to create an alias for.
	//
	// The following arguments are optional:
	AgentId string `pulumi:"agentId"`
	// Description of the alias.
	Description *string `pulumi:"description"`
	// Details about the routing configuration of the alias. See `routingConfiguration` block for details.
	RoutingConfigurations []AgentAgentAliasRoutingConfiguration `pulumi:"routingConfigurations"`
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     map[string]string        `pulumi:"tags"`
	Timeouts *AgentAgentAliasTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a AgentAgentAlias resource.
type AgentAgentAliasArgs struct {
	// Name of the alias.
	AgentAliasName pulumi.StringInput
	// Identifier of the agent to create an alias for.
	//
	// The following arguments are optional:
	AgentId pulumi.StringInput
	// Description of the alias.
	Description pulumi.StringPtrInput
	// Details about the routing configuration of the alias. See `routingConfiguration` block for details.
	RoutingConfigurations AgentAgentAliasRoutingConfigurationArrayInput
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     pulumi.StringMapInput
	Timeouts AgentAgentAliasTimeoutsPtrInput
}

func (AgentAgentAliasArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*agentAgentAliasArgs)(nil)).Elem()
}

type AgentAgentAliasInput interface {
	pulumi.Input

	ToAgentAgentAliasOutput() AgentAgentAliasOutput
	ToAgentAgentAliasOutputWithContext(ctx context.Context) AgentAgentAliasOutput
}

func (*AgentAgentAlias) ElementType() reflect.Type {
	return reflect.TypeOf((**AgentAgentAlias)(nil)).Elem()
}

func (i *AgentAgentAlias) ToAgentAgentAliasOutput() AgentAgentAliasOutput {
	return i.ToAgentAgentAliasOutputWithContext(context.Background())
}

func (i *AgentAgentAlias) ToAgentAgentAliasOutputWithContext(ctx context.Context) AgentAgentAliasOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AgentAgentAliasOutput)
}

// AgentAgentAliasArrayInput is an input type that accepts AgentAgentAliasArray and AgentAgentAliasArrayOutput values.
// You can construct a concrete instance of `AgentAgentAliasArrayInput` via:
//
//	AgentAgentAliasArray{ AgentAgentAliasArgs{...} }
type AgentAgentAliasArrayInput interface {
	pulumi.Input

	ToAgentAgentAliasArrayOutput() AgentAgentAliasArrayOutput
	ToAgentAgentAliasArrayOutputWithContext(context.Context) AgentAgentAliasArrayOutput
}

type AgentAgentAliasArray []AgentAgentAliasInput

func (AgentAgentAliasArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AgentAgentAlias)(nil)).Elem()
}

func (i AgentAgentAliasArray) ToAgentAgentAliasArrayOutput() AgentAgentAliasArrayOutput {
	return i.ToAgentAgentAliasArrayOutputWithContext(context.Background())
}

func (i AgentAgentAliasArray) ToAgentAgentAliasArrayOutputWithContext(ctx context.Context) AgentAgentAliasArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AgentAgentAliasArrayOutput)
}

// AgentAgentAliasMapInput is an input type that accepts AgentAgentAliasMap and AgentAgentAliasMapOutput values.
// You can construct a concrete instance of `AgentAgentAliasMapInput` via:
//
//	AgentAgentAliasMap{ "key": AgentAgentAliasArgs{...} }
type AgentAgentAliasMapInput interface {
	pulumi.Input

	ToAgentAgentAliasMapOutput() AgentAgentAliasMapOutput
	ToAgentAgentAliasMapOutputWithContext(context.Context) AgentAgentAliasMapOutput
}

type AgentAgentAliasMap map[string]AgentAgentAliasInput

func (AgentAgentAliasMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AgentAgentAlias)(nil)).Elem()
}

func (i AgentAgentAliasMap) ToAgentAgentAliasMapOutput() AgentAgentAliasMapOutput {
	return i.ToAgentAgentAliasMapOutputWithContext(context.Background())
}

func (i AgentAgentAliasMap) ToAgentAgentAliasMapOutputWithContext(ctx context.Context) AgentAgentAliasMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AgentAgentAliasMapOutput)
}

type AgentAgentAliasOutput struct{ *pulumi.OutputState }

func (AgentAgentAliasOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AgentAgentAlias)(nil)).Elem()
}

func (o AgentAgentAliasOutput) ToAgentAgentAliasOutput() AgentAgentAliasOutput {
	return o
}

func (o AgentAgentAliasOutput) ToAgentAgentAliasOutputWithContext(ctx context.Context) AgentAgentAliasOutput {
	return o
}

// ARN of the alias.
func (o AgentAgentAliasOutput) AgentAliasArn() pulumi.StringOutput {
	return o.ApplyT(func(v *AgentAgentAlias) pulumi.StringOutput { return v.AgentAliasArn }).(pulumi.StringOutput)
}

// Unique identifier of the alias.
func (o AgentAgentAliasOutput) AgentAliasId() pulumi.StringOutput {
	return o.ApplyT(func(v *AgentAgentAlias) pulumi.StringOutput { return v.AgentAliasId }).(pulumi.StringOutput)
}

// Name of the alias.
func (o AgentAgentAliasOutput) AgentAliasName() pulumi.StringOutput {
	return o.ApplyT(func(v *AgentAgentAlias) pulumi.StringOutput { return v.AgentAliasName }).(pulumi.StringOutput)
}

// Identifier of the agent to create an alias for.
//
// The following arguments are optional:
func (o AgentAgentAliasOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v *AgentAgentAlias) pulumi.StringOutput { return v.AgentId }).(pulumi.StringOutput)
}

// Description of the alias.
func (o AgentAgentAliasOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AgentAgentAlias) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Details about the routing configuration of the alias. See `routingConfiguration` block for details.
func (o AgentAgentAliasOutput) RoutingConfigurations() AgentAgentAliasRoutingConfigurationArrayOutput {
	return o.ApplyT(func(v *AgentAgentAlias) AgentAgentAliasRoutingConfigurationArrayOutput {
		return v.RoutingConfigurations
	}).(AgentAgentAliasRoutingConfigurationArrayOutput)
}

// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o AgentAgentAliasOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AgentAgentAlias) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o AgentAgentAliasOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AgentAgentAlias) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o AgentAgentAliasOutput) Timeouts() AgentAgentAliasTimeoutsPtrOutput {
	return o.ApplyT(func(v *AgentAgentAlias) AgentAgentAliasTimeoutsPtrOutput { return v.Timeouts }).(AgentAgentAliasTimeoutsPtrOutput)
}

type AgentAgentAliasArrayOutput struct{ *pulumi.OutputState }

func (AgentAgentAliasArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AgentAgentAlias)(nil)).Elem()
}

func (o AgentAgentAliasArrayOutput) ToAgentAgentAliasArrayOutput() AgentAgentAliasArrayOutput {
	return o
}

func (o AgentAgentAliasArrayOutput) ToAgentAgentAliasArrayOutputWithContext(ctx context.Context) AgentAgentAliasArrayOutput {
	return o
}

func (o AgentAgentAliasArrayOutput) Index(i pulumi.IntInput) AgentAgentAliasOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AgentAgentAlias {
		return vs[0].([]*AgentAgentAlias)[vs[1].(int)]
	}).(AgentAgentAliasOutput)
}

type AgentAgentAliasMapOutput struct{ *pulumi.OutputState }

func (AgentAgentAliasMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AgentAgentAlias)(nil)).Elem()
}

func (o AgentAgentAliasMapOutput) ToAgentAgentAliasMapOutput() AgentAgentAliasMapOutput {
	return o
}

func (o AgentAgentAliasMapOutput) ToAgentAgentAliasMapOutputWithContext(ctx context.Context) AgentAgentAliasMapOutput {
	return o
}

func (o AgentAgentAliasMapOutput) MapIndex(k pulumi.StringInput) AgentAgentAliasOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AgentAgentAlias {
		return vs[0].(map[string]*AgentAgentAlias)[vs[1].(string)]
	}).(AgentAgentAliasOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AgentAgentAliasInput)(nil)).Elem(), &AgentAgentAlias{})
	pulumi.RegisterInputType(reflect.TypeOf((*AgentAgentAliasArrayInput)(nil)).Elem(), AgentAgentAliasArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AgentAgentAliasMapInput)(nil)).Elem(), AgentAgentAliasMap{})
	pulumi.RegisterOutputType(AgentAgentAliasOutput{})
	pulumi.RegisterOutputType(AgentAgentAliasArrayOutput{})
	pulumi.RegisterOutputType(AgentAgentAliasMapOutput{})
}
