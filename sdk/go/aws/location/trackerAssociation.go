// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package location

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Location Tracker Association.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/location"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := location.NewGeofenceCollection(ctx, "example", &location.GeofenceCollectionArgs{
//				CollectionName: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTracker, err := location.NewTracker(ctx, "example", &location.TrackerArgs{
//				TrackerName: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = location.NewTrackerAssociation(ctx, "example", &location.TrackerAssociationArgs{
//				ConsumerArn: example.CollectionArn,
//				TrackerName: exampleTracker.TrackerName,
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
// Using `pulumi import`, import Location Tracker Association using the `tracker_name|consumer_arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:location/trackerAssociation:TrackerAssociation example "tracker_name|consumer_arn"
//
// ```
type TrackerAssociation struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker resource. Used when you need to specify a resource across all AWS.
	ConsumerArn pulumi.StringOutput `pulumi:"consumerArn"`
	// The name of the tracker resource to be associated with a geofence collection.
	TrackerName pulumi.StringOutput `pulumi:"trackerName"`
}

// NewTrackerAssociation registers a new resource with the given unique name, arguments, and options.
func NewTrackerAssociation(ctx *pulumi.Context,
	name string, args *TrackerAssociationArgs, opts ...pulumi.ResourceOption) (*TrackerAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConsumerArn == nil {
		return nil, errors.New("invalid value for required argument 'ConsumerArn'")
	}
	if args.TrackerName == nil {
		return nil, errors.New("invalid value for required argument 'TrackerName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TrackerAssociation
	err := ctx.RegisterResource("aws:location/trackerAssociation:TrackerAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTrackerAssociation gets an existing TrackerAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTrackerAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TrackerAssociationState, opts ...pulumi.ResourceOption) (*TrackerAssociation, error) {
	var resource TrackerAssociation
	err := ctx.ReadResource("aws:location/trackerAssociation:TrackerAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TrackerAssociation resources.
type trackerAssociationState struct {
	// The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker resource. Used when you need to specify a resource across all AWS.
	ConsumerArn *string `pulumi:"consumerArn"`
	// The name of the tracker resource to be associated with a geofence collection.
	TrackerName *string `pulumi:"trackerName"`
}

type TrackerAssociationState struct {
	// The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker resource. Used when you need to specify a resource across all AWS.
	ConsumerArn pulumi.StringPtrInput
	// The name of the tracker resource to be associated with a geofence collection.
	TrackerName pulumi.StringPtrInput
}

func (TrackerAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*trackerAssociationState)(nil)).Elem()
}

type trackerAssociationArgs struct {
	// The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker resource. Used when you need to specify a resource across all AWS.
	ConsumerArn string `pulumi:"consumerArn"`
	// The name of the tracker resource to be associated with a geofence collection.
	TrackerName string `pulumi:"trackerName"`
}

// The set of arguments for constructing a TrackerAssociation resource.
type TrackerAssociationArgs struct {
	// The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker resource. Used when you need to specify a resource across all AWS.
	ConsumerArn pulumi.StringInput
	// The name of the tracker resource to be associated with a geofence collection.
	TrackerName pulumi.StringInput
}

func (TrackerAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*trackerAssociationArgs)(nil)).Elem()
}

type TrackerAssociationInput interface {
	pulumi.Input

	ToTrackerAssociationOutput() TrackerAssociationOutput
	ToTrackerAssociationOutputWithContext(ctx context.Context) TrackerAssociationOutput
}

func (*TrackerAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**TrackerAssociation)(nil)).Elem()
}

func (i *TrackerAssociation) ToTrackerAssociationOutput() TrackerAssociationOutput {
	return i.ToTrackerAssociationOutputWithContext(context.Background())
}

func (i *TrackerAssociation) ToTrackerAssociationOutputWithContext(ctx context.Context) TrackerAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrackerAssociationOutput)
}

// TrackerAssociationArrayInput is an input type that accepts TrackerAssociationArray and TrackerAssociationArrayOutput values.
// You can construct a concrete instance of `TrackerAssociationArrayInput` via:
//
//	TrackerAssociationArray{ TrackerAssociationArgs{...} }
type TrackerAssociationArrayInput interface {
	pulumi.Input

	ToTrackerAssociationArrayOutput() TrackerAssociationArrayOutput
	ToTrackerAssociationArrayOutputWithContext(context.Context) TrackerAssociationArrayOutput
}

type TrackerAssociationArray []TrackerAssociationInput

func (TrackerAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrackerAssociation)(nil)).Elem()
}

func (i TrackerAssociationArray) ToTrackerAssociationArrayOutput() TrackerAssociationArrayOutput {
	return i.ToTrackerAssociationArrayOutputWithContext(context.Background())
}

func (i TrackerAssociationArray) ToTrackerAssociationArrayOutputWithContext(ctx context.Context) TrackerAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrackerAssociationArrayOutput)
}

// TrackerAssociationMapInput is an input type that accepts TrackerAssociationMap and TrackerAssociationMapOutput values.
// You can construct a concrete instance of `TrackerAssociationMapInput` via:
//
//	TrackerAssociationMap{ "key": TrackerAssociationArgs{...} }
type TrackerAssociationMapInput interface {
	pulumi.Input

	ToTrackerAssociationMapOutput() TrackerAssociationMapOutput
	ToTrackerAssociationMapOutputWithContext(context.Context) TrackerAssociationMapOutput
}

type TrackerAssociationMap map[string]TrackerAssociationInput

func (TrackerAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrackerAssociation)(nil)).Elem()
}

func (i TrackerAssociationMap) ToTrackerAssociationMapOutput() TrackerAssociationMapOutput {
	return i.ToTrackerAssociationMapOutputWithContext(context.Background())
}

func (i TrackerAssociationMap) ToTrackerAssociationMapOutputWithContext(ctx context.Context) TrackerAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrackerAssociationMapOutput)
}

type TrackerAssociationOutput struct{ *pulumi.OutputState }

func (TrackerAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TrackerAssociation)(nil)).Elem()
}

func (o TrackerAssociationOutput) ToTrackerAssociationOutput() TrackerAssociationOutput {
	return o
}

func (o TrackerAssociationOutput) ToTrackerAssociationOutputWithContext(ctx context.Context) TrackerAssociationOutput {
	return o
}

// The Amazon Resource Name (ARN) for the geofence collection to be associated to tracker resource. Used when you need to specify a resource across all AWS.
func (o TrackerAssociationOutput) ConsumerArn() pulumi.StringOutput {
	return o.ApplyT(func(v *TrackerAssociation) pulumi.StringOutput { return v.ConsumerArn }).(pulumi.StringOutput)
}

// The name of the tracker resource to be associated with a geofence collection.
func (o TrackerAssociationOutput) TrackerName() pulumi.StringOutput {
	return o.ApplyT(func(v *TrackerAssociation) pulumi.StringOutput { return v.TrackerName }).(pulumi.StringOutput)
}

type TrackerAssociationArrayOutput struct{ *pulumi.OutputState }

func (TrackerAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrackerAssociation)(nil)).Elem()
}

func (o TrackerAssociationArrayOutput) ToTrackerAssociationArrayOutput() TrackerAssociationArrayOutput {
	return o
}

func (o TrackerAssociationArrayOutput) ToTrackerAssociationArrayOutputWithContext(ctx context.Context) TrackerAssociationArrayOutput {
	return o
}

func (o TrackerAssociationArrayOutput) Index(i pulumi.IntInput) TrackerAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TrackerAssociation {
		return vs[0].([]*TrackerAssociation)[vs[1].(int)]
	}).(TrackerAssociationOutput)
}

type TrackerAssociationMapOutput struct{ *pulumi.OutputState }

func (TrackerAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrackerAssociation)(nil)).Elem()
}

func (o TrackerAssociationMapOutput) ToTrackerAssociationMapOutput() TrackerAssociationMapOutput {
	return o
}

func (o TrackerAssociationMapOutput) ToTrackerAssociationMapOutputWithContext(ctx context.Context) TrackerAssociationMapOutput {
	return o
}

func (o TrackerAssociationMapOutput) MapIndex(k pulumi.StringInput) TrackerAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TrackerAssociation {
		return vs[0].(map[string]*TrackerAssociation)[vs[1].(string)]
	}).(TrackerAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TrackerAssociationInput)(nil)).Elem(), &TrackerAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrackerAssociationArrayInput)(nil)).Elem(), TrackerAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrackerAssociationMapInput)(nil)).Elem(), TrackerAssociationMap{})
	pulumi.RegisterOutputType(TrackerAssociationOutput{})
	pulumi.RegisterOutputType(TrackerAssociationArrayOutput{})
	pulumi.RegisterOutputType(TrackerAssociationMapOutput{})
}
