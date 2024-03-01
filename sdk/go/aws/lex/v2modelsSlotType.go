// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lex

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Lex V2 Models Slot Type.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lex"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// _, err := iam.NewRolePolicyAttachment(ctx, "test", &iam.RolePolicyAttachmentArgs{
// Role: pulumi.Any(testAwsIamRole.Name),
// PolicyArn: pulumi.String(fmt.Sprintf("arn:%v:iam::aws:policy/AmazonLexFullAccess", current.Partition)),
// })
// if err != nil {
// return err
// }
// testV2modelsBot, err := lex.NewV2modelsBot(ctx, "test", &lex.V2modelsBotArgs{
// Name: pulumi.String("testbot"),
// IdleSessionTtlInSeconds: pulumi.Int(60),
// RoleArn: pulumi.Any(testAwsIamRole.Arn),
// DataPrivacies: lex.V2modelsBotDataPrivacyArray{
// &lex.V2modelsBotDataPrivacyArgs{
// ChildDirected: pulumi.Bool(true),
// },
// },
// })
// if err != nil {
// return err
// }
// testV2modelsBotLocale, err := lex.NewV2modelsBotLocale(ctx, "test", &lex.V2modelsBotLocaleArgs{
// LocaleId: pulumi.String("en_US"),
// BotId: testV2modelsBot.ID(),
// BotVersion: pulumi.String("DRAFT"),
// NLuIntentConfidenceThreshold: pulumi.Float64(0.7),
// })
// if err != nil {
// return err
// }
// _, err = lex.NewV2modelsBotVersion(ctx, "test", &lex.V2modelsBotVersionArgs{
// BotId: testV2modelsBot.ID(),
// LocaleSpecification: testV2modelsBotLocale.LocaleId.ApplyT(func(localeId string) (map[string]map[string]interface{}, error) {
// return map[string]map[string]interface{}{
// localeId: map[string]interface{}{
// "sourceBotVersion": "DRAFT",
// },
// }, nil
// }).(pulumi.Map[string]map[string]interface{}Output),
// })
// if err != nil {
// return err
// }
// _, err = lex.NewV2modelsSlotType(ctx, "test", &lex.V2modelsSlotTypeArgs{
// BotId: testV2modelsBot.ID(),
// BotVersion: testV2modelsBotLocale.BotVersion,
// Name: pulumi.String("test"),
// LocaleId: testV2modelsBotLocale.LocaleId,
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// ## Import
//
// Using `pulumi import`, import Lex V2 Models Slot Type using the `example_id_arg`. For example:
//
// ```sh
//
//	$ pulumi import aws:lex/v2modelsSlotType:V2modelsSlotType example bot-1234,DRAFT,en_US,slot_type-id-12345678
//
// ```
type V2modelsSlotType struct {
	pulumi.CustomResourceState

	// Identifier of the bot associated with this slot type.
	BotId pulumi.StringOutput `pulumi:"botId"`
	// Version of the bot associated with this slot type.
	BotVersion pulumi.StringOutput `pulumi:"botVersion"`
	// Specifications for a composite slot type. See `compositeSlotTypeSetting` argument reference below.
	CompositeSlotTypeSetting V2modelsSlotTypeCompositeSlotTypeSettingPtrOutput `pulumi:"compositeSlotTypeSetting"`
	// Description of the slot type.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Type of external information used to create the slot type. See `externalSourceSetting` argument reference below.
	ExternalSourceSetting V2modelsSlotTypeExternalSourceSettingPtrOutput `pulumi:"externalSourceSetting"`
	// Identifier of the language and locale where this slot type is used. All of the bots, slot types, and slots used by the intent must have the same locale.
	LocaleId pulumi.StringOutput `pulumi:"localeId"`
	// Name of the slot type
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// Built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type has the configuration of the parent slot type. Only AMAZON.AlphaNumeric is supported.
	ParentSlotTypeSignature pulumi.StringPtrOutput `pulumi:"parentSlotTypeSignature"`
	// Unique identifier assigned to a slot type. This refers to either a built-in slot type or the unique slotTypeId of a custom slot type.
	SlotTypeId pulumi.StringOutput `pulumi:"slotTypeId"`
	// List of SlotTypeValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot. See `slotTypeValues` argument reference below.
	SlotTypeValues V2modelsSlotTypeSlotTypeValuesPtrOutput `pulumi:"slotTypeValues"`
	Timeouts       V2modelsSlotTypeTimeoutsPtrOutput       `pulumi:"timeouts"`
	// Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be set to one of the following values: `ORIGINAL_VALUE` returns the value entered by the user, if the user value is similar to the slot value. `TOP_RESOLUTION` if there is a resolution list for the slot, return the first value in the resolution list. If there is no resolution list, return null. If you don't specify the valueSelectionSetting parameter, the default is ORIGINAL_VALUE. See `valueSelectionSetting` argument reference below.
	ValueSelectionSetting V2modelsSlotTypeValueSelectionSettingPtrOutput `pulumi:"valueSelectionSetting"`
}

// NewV2modelsSlotType registers a new resource with the given unique name, arguments, and options.
func NewV2modelsSlotType(ctx *pulumi.Context,
	name string, args *V2modelsSlotTypeArgs, opts ...pulumi.ResourceOption) (*V2modelsSlotType, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BotId == nil {
		return nil, errors.New("invalid value for required argument 'BotId'")
	}
	if args.BotVersion == nil {
		return nil, errors.New("invalid value for required argument 'BotVersion'")
	}
	if args.LocaleId == nil {
		return nil, errors.New("invalid value for required argument 'LocaleId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource V2modelsSlotType
	err := ctx.RegisterResource("aws:lex/v2modelsSlotType:V2modelsSlotType", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetV2modelsSlotType gets an existing V2modelsSlotType resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetV2modelsSlotType(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *V2modelsSlotTypeState, opts ...pulumi.ResourceOption) (*V2modelsSlotType, error) {
	var resource V2modelsSlotType
	err := ctx.ReadResource("aws:lex/v2modelsSlotType:V2modelsSlotType", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering V2modelsSlotType resources.
type v2modelsSlotTypeState struct {
	// Identifier of the bot associated with this slot type.
	BotId *string `pulumi:"botId"`
	// Version of the bot associated with this slot type.
	BotVersion *string `pulumi:"botVersion"`
	// Specifications for a composite slot type. See `compositeSlotTypeSetting` argument reference below.
	CompositeSlotTypeSetting *V2modelsSlotTypeCompositeSlotTypeSetting `pulumi:"compositeSlotTypeSetting"`
	// Description of the slot type.
	Description *string `pulumi:"description"`
	// Type of external information used to create the slot type. See `externalSourceSetting` argument reference below.
	ExternalSourceSetting *V2modelsSlotTypeExternalSourceSetting `pulumi:"externalSourceSetting"`
	// Identifier of the language and locale where this slot type is used. All of the bots, slot types, and slots used by the intent must have the same locale.
	LocaleId *string `pulumi:"localeId"`
	// Name of the slot type
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type has the configuration of the parent slot type. Only AMAZON.AlphaNumeric is supported.
	ParentSlotTypeSignature *string `pulumi:"parentSlotTypeSignature"`
	// Unique identifier assigned to a slot type. This refers to either a built-in slot type or the unique slotTypeId of a custom slot type.
	SlotTypeId *string `pulumi:"slotTypeId"`
	// List of SlotTypeValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot. See `slotTypeValues` argument reference below.
	SlotTypeValues *V2modelsSlotTypeSlotTypeValues `pulumi:"slotTypeValues"`
	Timeouts       *V2modelsSlotTypeTimeouts       `pulumi:"timeouts"`
	// Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be set to one of the following values: `ORIGINAL_VALUE` returns the value entered by the user, if the user value is similar to the slot value. `TOP_RESOLUTION` if there is a resolution list for the slot, return the first value in the resolution list. If there is no resolution list, return null. If you don't specify the valueSelectionSetting parameter, the default is ORIGINAL_VALUE. See `valueSelectionSetting` argument reference below.
	ValueSelectionSetting *V2modelsSlotTypeValueSelectionSetting `pulumi:"valueSelectionSetting"`
}

type V2modelsSlotTypeState struct {
	// Identifier of the bot associated with this slot type.
	BotId pulumi.StringPtrInput
	// Version of the bot associated with this slot type.
	BotVersion pulumi.StringPtrInput
	// Specifications for a composite slot type. See `compositeSlotTypeSetting` argument reference below.
	CompositeSlotTypeSetting V2modelsSlotTypeCompositeSlotTypeSettingPtrInput
	// Description of the slot type.
	Description pulumi.StringPtrInput
	// Type of external information used to create the slot type. See `externalSourceSetting` argument reference below.
	ExternalSourceSetting V2modelsSlotTypeExternalSourceSettingPtrInput
	// Identifier of the language and locale where this slot type is used. All of the bots, slot types, and slots used by the intent must have the same locale.
	LocaleId pulumi.StringPtrInput
	// Name of the slot type
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type has the configuration of the parent slot type. Only AMAZON.AlphaNumeric is supported.
	ParentSlotTypeSignature pulumi.StringPtrInput
	// Unique identifier assigned to a slot type. This refers to either a built-in slot type or the unique slotTypeId of a custom slot type.
	SlotTypeId pulumi.StringPtrInput
	// List of SlotTypeValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot. See `slotTypeValues` argument reference below.
	SlotTypeValues V2modelsSlotTypeSlotTypeValuesPtrInput
	Timeouts       V2modelsSlotTypeTimeoutsPtrInput
	// Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be set to one of the following values: `ORIGINAL_VALUE` returns the value entered by the user, if the user value is similar to the slot value. `TOP_RESOLUTION` if there is a resolution list for the slot, return the first value in the resolution list. If there is no resolution list, return null. If you don't specify the valueSelectionSetting parameter, the default is ORIGINAL_VALUE. See `valueSelectionSetting` argument reference below.
	ValueSelectionSetting V2modelsSlotTypeValueSelectionSettingPtrInput
}

func (V2modelsSlotTypeState) ElementType() reflect.Type {
	return reflect.TypeOf((*v2modelsSlotTypeState)(nil)).Elem()
}

type v2modelsSlotTypeArgs struct {
	// Identifier of the bot associated with this slot type.
	BotId string `pulumi:"botId"`
	// Version of the bot associated with this slot type.
	BotVersion string `pulumi:"botVersion"`
	// Specifications for a composite slot type. See `compositeSlotTypeSetting` argument reference below.
	CompositeSlotTypeSetting *V2modelsSlotTypeCompositeSlotTypeSetting `pulumi:"compositeSlotTypeSetting"`
	// Description of the slot type.
	Description *string `pulumi:"description"`
	// Type of external information used to create the slot type. See `externalSourceSetting` argument reference below.
	ExternalSourceSetting *V2modelsSlotTypeExternalSourceSetting `pulumi:"externalSourceSetting"`
	// Identifier of the language and locale where this slot type is used. All of the bots, slot types, and slots used by the intent must have the same locale.
	LocaleId string `pulumi:"localeId"`
	// Name of the slot type
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type has the configuration of the parent slot type. Only AMAZON.AlphaNumeric is supported.
	ParentSlotTypeSignature *string `pulumi:"parentSlotTypeSignature"`
	// List of SlotTypeValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot. See `slotTypeValues` argument reference below.
	SlotTypeValues *V2modelsSlotTypeSlotTypeValues `pulumi:"slotTypeValues"`
	Timeouts       *V2modelsSlotTypeTimeouts       `pulumi:"timeouts"`
	// Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be set to one of the following values: `ORIGINAL_VALUE` returns the value entered by the user, if the user value is similar to the slot value. `TOP_RESOLUTION` if there is a resolution list for the slot, return the first value in the resolution list. If there is no resolution list, return null. If you don't specify the valueSelectionSetting parameter, the default is ORIGINAL_VALUE. See `valueSelectionSetting` argument reference below.
	ValueSelectionSetting *V2modelsSlotTypeValueSelectionSetting `pulumi:"valueSelectionSetting"`
}

// The set of arguments for constructing a V2modelsSlotType resource.
type V2modelsSlotTypeArgs struct {
	// Identifier of the bot associated with this slot type.
	BotId pulumi.StringInput
	// Version of the bot associated with this slot type.
	BotVersion pulumi.StringInput
	// Specifications for a composite slot type. See `compositeSlotTypeSetting` argument reference below.
	CompositeSlotTypeSetting V2modelsSlotTypeCompositeSlotTypeSettingPtrInput
	// Description of the slot type.
	Description pulumi.StringPtrInput
	// Type of external information used to create the slot type. See `externalSourceSetting` argument reference below.
	ExternalSourceSetting V2modelsSlotTypeExternalSourceSettingPtrInput
	// Identifier of the language and locale where this slot type is used. All of the bots, slot types, and slots used by the intent must have the same locale.
	LocaleId pulumi.StringInput
	// Name of the slot type
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type has the configuration of the parent slot type. Only AMAZON.AlphaNumeric is supported.
	ParentSlotTypeSignature pulumi.StringPtrInput
	// List of SlotTypeValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot. See `slotTypeValues` argument reference below.
	SlotTypeValues V2modelsSlotTypeSlotTypeValuesPtrInput
	Timeouts       V2modelsSlotTypeTimeoutsPtrInput
	// Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be set to one of the following values: `ORIGINAL_VALUE` returns the value entered by the user, if the user value is similar to the slot value. `TOP_RESOLUTION` if there is a resolution list for the slot, return the first value in the resolution list. If there is no resolution list, return null. If you don't specify the valueSelectionSetting parameter, the default is ORIGINAL_VALUE. See `valueSelectionSetting` argument reference below.
	ValueSelectionSetting V2modelsSlotTypeValueSelectionSettingPtrInput
}

func (V2modelsSlotTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*v2modelsSlotTypeArgs)(nil)).Elem()
}

type V2modelsSlotTypeInput interface {
	pulumi.Input

	ToV2modelsSlotTypeOutput() V2modelsSlotTypeOutput
	ToV2modelsSlotTypeOutputWithContext(ctx context.Context) V2modelsSlotTypeOutput
}

func (*V2modelsSlotType) ElementType() reflect.Type {
	return reflect.TypeOf((**V2modelsSlotType)(nil)).Elem()
}

func (i *V2modelsSlotType) ToV2modelsSlotTypeOutput() V2modelsSlotTypeOutput {
	return i.ToV2modelsSlotTypeOutputWithContext(context.Background())
}

func (i *V2modelsSlotType) ToV2modelsSlotTypeOutputWithContext(ctx context.Context) V2modelsSlotTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2modelsSlotTypeOutput)
}

// V2modelsSlotTypeArrayInput is an input type that accepts V2modelsSlotTypeArray and V2modelsSlotTypeArrayOutput values.
// You can construct a concrete instance of `V2modelsSlotTypeArrayInput` via:
//
//	V2modelsSlotTypeArray{ V2modelsSlotTypeArgs{...} }
type V2modelsSlotTypeArrayInput interface {
	pulumi.Input

	ToV2modelsSlotTypeArrayOutput() V2modelsSlotTypeArrayOutput
	ToV2modelsSlotTypeArrayOutputWithContext(context.Context) V2modelsSlotTypeArrayOutput
}

type V2modelsSlotTypeArray []V2modelsSlotTypeInput

func (V2modelsSlotTypeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2modelsSlotType)(nil)).Elem()
}

func (i V2modelsSlotTypeArray) ToV2modelsSlotTypeArrayOutput() V2modelsSlotTypeArrayOutput {
	return i.ToV2modelsSlotTypeArrayOutputWithContext(context.Background())
}

func (i V2modelsSlotTypeArray) ToV2modelsSlotTypeArrayOutputWithContext(ctx context.Context) V2modelsSlotTypeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2modelsSlotTypeArrayOutput)
}

// V2modelsSlotTypeMapInput is an input type that accepts V2modelsSlotTypeMap and V2modelsSlotTypeMapOutput values.
// You can construct a concrete instance of `V2modelsSlotTypeMapInput` via:
//
//	V2modelsSlotTypeMap{ "key": V2modelsSlotTypeArgs{...} }
type V2modelsSlotTypeMapInput interface {
	pulumi.Input

	ToV2modelsSlotTypeMapOutput() V2modelsSlotTypeMapOutput
	ToV2modelsSlotTypeMapOutputWithContext(context.Context) V2modelsSlotTypeMapOutput
}

type V2modelsSlotTypeMap map[string]V2modelsSlotTypeInput

func (V2modelsSlotTypeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2modelsSlotType)(nil)).Elem()
}

func (i V2modelsSlotTypeMap) ToV2modelsSlotTypeMapOutput() V2modelsSlotTypeMapOutput {
	return i.ToV2modelsSlotTypeMapOutputWithContext(context.Background())
}

func (i V2modelsSlotTypeMap) ToV2modelsSlotTypeMapOutputWithContext(ctx context.Context) V2modelsSlotTypeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(V2modelsSlotTypeMapOutput)
}

type V2modelsSlotTypeOutput struct{ *pulumi.OutputState }

func (V2modelsSlotTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**V2modelsSlotType)(nil)).Elem()
}

func (o V2modelsSlotTypeOutput) ToV2modelsSlotTypeOutput() V2modelsSlotTypeOutput {
	return o
}

func (o V2modelsSlotTypeOutput) ToV2modelsSlotTypeOutputWithContext(ctx context.Context) V2modelsSlotTypeOutput {
	return o
}

// Identifier of the bot associated with this slot type.
func (o V2modelsSlotTypeOutput) BotId() pulumi.StringOutput {
	return o.ApplyT(func(v *V2modelsSlotType) pulumi.StringOutput { return v.BotId }).(pulumi.StringOutput)
}

// Version of the bot associated with this slot type.
func (o V2modelsSlotTypeOutput) BotVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *V2modelsSlotType) pulumi.StringOutput { return v.BotVersion }).(pulumi.StringOutput)
}

// Specifications for a composite slot type. See `compositeSlotTypeSetting` argument reference below.
func (o V2modelsSlotTypeOutput) CompositeSlotTypeSetting() V2modelsSlotTypeCompositeSlotTypeSettingPtrOutput {
	return o.ApplyT(func(v *V2modelsSlotType) V2modelsSlotTypeCompositeSlotTypeSettingPtrOutput {
		return v.CompositeSlotTypeSetting
	}).(V2modelsSlotTypeCompositeSlotTypeSettingPtrOutput)
}

// Description of the slot type.
func (o V2modelsSlotTypeOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *V2modelsSlotType) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Type of external information used to create the slot type. See `externalSourceSetting` argument reference below.
func (o V2modelsSlotTypeOutput) ExternalSourceSetting() V2modelsSlotTypeExternalSourceSettingPtrOutput {
	return o.ApplyT(func(v *V2modelsSlotType) V2modelsSlotTypeExternalSourceSettingPtrOutput {
		return v.ExternalSourceSetting
	}).(V2modelsSlotTypeExternalSourceSettingPtrOutput)
}

// Identifier of the language and locale where this slot type is used. All of the bots, slot types, and slots used by the intent must have the same locale.
func (o V2modelsSlotTypeOutput) LocaleId() pulumi.StringOutput {
	return o.ApplyT(func(v *V2modelsSlotType) pulumi.StringOutput { return v.LocaleId }).(pulumi.StringOutput)
}

// Name of the slot type
//
// The following arguments are optional:
func (o V2modelsSlotTypeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *V2modelsSlotType) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type has the configuration of the parent slot type. Only AMAZON.AlphaNumeric is supported.
func (o V2modelsSlotTypeOutput) ParentSlotTypeSignature() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *V2modelsSlotType) pulumi.StringPtrOutput { return v.ParentSlotTypeSignature }).(pulumi.StringPtrOutput)
}

// Unique identifier assigned to a slot type. This refers to either a built-in slot type or the unique slotTypeId of a custom slot type.
func (o V2modelsSlotTypeOutput) SlotTypeId() pulumi.StringOutput {
	return o.ApplyT(func(v *V2modelsSlotType) pulumi.StringOutput { return v.SlotTypeId }).(pulumi.StringOutput)
}

// List of SlotTypeValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot. See `slotTypeValues` argument reference below.
func (o V2modelsSlotTypeOutput) SlotTypeValues() V2modelsSlotTypeSlotTypeValuesPtrOutput {
	return o.ApplyT(func(v *V2modelsSlotType) V2modelsSlotTypeSlotTypeValuesPtrOutput { return v.SlotTypeValues }).(V2modelsSlotTypeSlotTypeValuesPtrOutput)
}

func (o V2modelsSlotTypeOutput) Timeouts() V2modelsSlotTypeTimeoutsPtrOutput {
	return o.ApplyT(func(v *V2modelsSlotType) V2modelsSlotTypeTimeoutsPtrOutput { return v.Timeouts }).(V2modelsSlotTypeTimeoutsPtrOutput)
}

// Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be set to one of the following values: `ORIGINAL_VALUE` returns the value entered by the user, if the user value is similar to the slot value. `TOP_RESOLUTION` if there is a resolution list for the slot, return the first value in the resolution list. If there is no resolution list, return null. If you don't specify the valueSelectionSetting parameter, the default is ORIGINAL_VALUE. See `valueSelectionSetting` argument reference below.
func (o V2modelsSlotTypeOutput) ValueSelectionSetting() V2modelsSlotTypeValueSelectionSettingPtrOutput {
	return o.ApplyT(func(v *V2modelsSlotType) V2modelsSlotTypeValueSelectionSettingPtrOutput {
		return v.ValueSelectionSetting
	}).(V2modelsSlotTypeValueSelectionSettingPtrOutput)
}

type V2modelsSlotTypeArrayOutput struct{ *pulumi.OutputState }

func (V2modelsSlotTypeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*V2modelsSlotType)(nil)).Elem()
}

func (o V2modelsSlotTypeArrayOutput) ToV2modelsSlotTypeArrayOutput() V2modelsSlotTypeArrayOutput {
	return o
}

func (o V2modelsSlotTypeArrayOutput) ToV2modelsSlotTypeArrayOutputWithContext(ctx context.Context) V2modelsSlotTypeArrayOutput {
	return o
}

func (o V2modelsSlotTypeArrayOutput) Index(i pulumi.IntInput) V2modelsSlotTypeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *V2modelsSlotType {
		return vs[0].([]*V2modelsSlotType)[vs[1].(int)]
	}).(V2modelsSlotTypeOutput)
}

type V2modelsSlotTypeMapOutput struct{ *pulumi.OutputState }

func (V2modelsSlotTypeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*V2modelsSlotType)(nil)).Elem()
}

func (o V2modelsSlotTypeMapOutput) ToV2modelsSlotTypeMapOutput() V2modelsSlotTypeMapOutput {
	return o
}

func (o V2modelsSlotTypeMapOutput) ToV2modelsSlotTypeMapOutputWithContext(ctx context.Context) V2modelsSlotTypeMapOutput {
	return o
}

func (o V2modelsSlotTypeMapOutput) MapIndex(k pulumi.StringInput) V2modelsSlotTypeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *V2modelsSlotType {
		return vs[0].(map[string]*V2modelsSlotType)[vs[1].(string)]
	}).(V2modelsSlotTypeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*V2modelsSlotTypeInput)(nil)).Elem(), &V2modelsSlotType{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2modelsSlotTypeArrayInput)(nil)).Elem(), V2modelsSlotTypeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*V2modelsSlotTypeMapInput)(nil)).Elem(), V2modelsSlotTypeMap{})
	pulumi.RegisterOutputType(V2modelsSlotTypeOutput{})
	pulumi.RegisterOutputType(V2modelsSlotTypeArrayOutput{})
	pulumi.RegisterOutputType(V2modelsSlotTypeMapOutput{})
}
