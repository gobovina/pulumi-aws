# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['SinkPolicyArgs', 'SinkPolicy']

@pulumi.input_type
class SinkPolicyArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 sink_identifier: pulumi.Input[str]):
        """
        The set of arguments for constructing a SinkPolicy resource.
        :param pulumi.Input[str] policy: JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here.
        :param pulumi.Input[str] sink_identifier: ARN of the sink to attach this policy to.
        """
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "sink_identifier", sink_identifier)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="sinkIdentifier")
    def sink_identifier(self) -> pulumi.Input[str]:
        """
        ARN of the sink to attach this policy to.
        """
        return pulumi.get(self, "sink_identifier")

    @sink_identifier.setter
    def sink_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "sink_identifier", value)


@pulumi.input_type
class _SinkPolicyState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 sink_id: Optional[pulumi.Input[str]] = None,
                 sink_identifier: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SinkPolicy resources.
        :param pulumi.Input[str] arn: ARN of the Sink.
        :param pulumi.Input[str] policy: JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here.
        :param pulumi.Input[str] sink_id: ID string that AWS generated as part of the sink ARN.
        :param pulumi.Input[str] sink_identifier: ARN of the sink to attach this policy to.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if sink_id is not None:
            pulumi.set(__self__, "sink_id", sink_id)
        if sink_identifier is not None:
            pulumi.set(__self__, "sink_identifier", sink_identifier)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the Sink.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="sinkId")
    def sink_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID string that AWS generated as part of the sink ARN.
        """
        return pulumi.get(self, "sink_id")

    @sink_id.setter
    def sink_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sink_id", value)

    @property
    @pulumi.getter(name="sinkIdentifier")
    def sink_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the sink to attach this policy to.
        """
        return pulumi.get(self, "sink_identifier")

    @sink_identifier.setter
    def sink_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sink_identifier", value)


class SinkPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 sink_identifier: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS CloudWatch Observability Access Manager Sink Policy.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.oam.Sink("example", name="ExampleSink")
        example_sink_policy = aws.oam.SinkPolicy("example",
            sink_identifier=example.id,
            policy=json.dumps({
                "Version": "2012-10-17",
                "Statement": [{
                    "Action": [
                        "oam:CreateLink",
                        "oam:UpdateLink",
                    ],
                    "Effect": "Allow",
                    "Resource": "*",
                    "Principal": {
                        "AWS": [
                            "1111111111111",
                            "222222222222",
                        ],
                    },
                    "Condition": {
                        "ForAllValues:StringEquals": {
                            "oam:ResourceTypes": [
                                "AWS::CloudWatch::Metric",
                                "AWS::Logs::LogGroup",
                            ],
                        },
                    },
                }],
            }))
        ```

        ## Import

        Using `pulumi import`, import CloudWatch Observability Access Manager Sink Policy using the `sink_identifier`. For example:

        ```sh
        $ pulumi import aws:oam/sinkPolicy:SinkPolicy example arn:aws:oam:us-west-2:123456789012:sink/sink-id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here.
        :param pulumi.Input[str] sink_identifier: ARN of the sink to attach this policy to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SinkPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS CloudWatch Observability Access Manager Sink Policy.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.oam.Sink("example", name="ExampleSink")
        example_sink_policy = aws.oam.SinkPolicy("example",
            sink_identifier=example.id,
            policy=json.dumps({
                "Version": "2012-10-17",
                "Statement": [{
                    "Action": [
                        "oam:CreateLink",
                        "oam:UpdateLink",
                    ],
                    "Effect": "Allow",
                    "Resource": "*",
                    "Principal": {
                        "AWS": [
                            "1111111111111",
                            "222222222222",
                        ],
                    },
                    "Condition": {
                        "ForAllValues:StringEquals": {
                            "oam:ResourceTypes": [
                                "AWS::CloudWatch::Metric",
                                "AWS::Logs::LogGroup",
                            ],
                        },
                    },
                }],
            }))
        ```

        ## Import

        Using `pulumi import`, import CloudWatch Observability Access Manager Sink Policy using the `sink_identifier`. For example:

        ```sh
        $ pulumi import aws:oam/sinkPolicy:SinkPolicy example arn:aws:oam:us-west-2:123456789012:sink/sink-id
        ```

        :param str resource_name: The name of the resource.
        :param SinkPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SinkPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 sink_identifier: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SinkPolicyArgs.__new__(SinkPolicyArgs)

            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            if sink_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'sink_identifier'")
            __props__.__dict__["sink_identifier"] = sink_identifier
            __props__.__dict__["arn"] = None
            __props__.__dict__["sink_id"] = None
        super(SinkPolicy, __self__).__init__(
            'aws:oam/sinkPolicy:SinkPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            policy: Optional[pulumi.Input[str]] = None,
            sink_id: Optional[pulumi.Input[str]] = None,
            sink_identifier: Optional[pulumi.Input[str]] = None) -> 'SinkPolicy':
        """
        Get an existing SinkPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the Sink.
        :param pulumi.Input[str] policy: JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here.
        :param pulumi.Input[str] sink_id: ID string that AWS generated as part of the sink ARN.
        :param pulumi.Input[str] sink_identifier: ARN of the sink to attach this policy to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SinkPolicyState.__new__(_SinkPolicyState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["policy"] = policy
        __props__.__dict__["sink_id"] = sink_id
        __props__.__dict__["sink_identifier"] = sink_identifier
        return SinkPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the Sink.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="sinkId")
    def sink_id(self) -> pulumi.Output[str]:
        """
        ID string that AWS generated as part of the sink ARN.
        """
        return pulumi.get(self, "sink_id")

    @property
    @pulumi.getter(name="sinkIdentifier")
    def sink_identifier(self) -> pulumi.Output[str]:
        """
        ARN of the sink to attach this policy to.
        """
        return pulumi.get(self, "sink_identifier")

