# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TrafficPolicyArgs', 'TrafficPolicy']

@pulumi.input_type
class TrafficPolicyArgs:
    def __init__(__self__, *,
                 document: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TrafficPolicy resource.
        :param pulumi.Input[str] document: Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)
               
               The following arguments are optional:
        :param pulumi.Input[str] comment: Comment for the traffic policy.
        :param pulumi.Input[str] name: Name of the traffic policy.
        """
        pulumi.set(__self__, "document", document)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def document(self) -> pulumi.Input[str]:
        """
        Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)

        The following arguments are optional:
        """
        return pulumi.get(self, "document")

    @document.setter
    def document(self, value: pulumi.Input[str]):
        pulumi.set(self, "document", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment for the traffic policy.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the traffic policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _TrafficPolicyState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 document: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering TrafficPolicy resources.
        :param pulumi.Input[str] comment: Comment for the traffic policy.
        :param pulumi.Input[str] document: Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)
               
               The following arguments are optional:
        :param pulumi.Input[str] name: Name of the traffic policy.
        :param pulumi.Input[str] type: DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
        :param pulumi.Input[int] version: Version number of the traffic policy. This value is automatically incremented by AWS after each update of this resource.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if document is not None:
            pulumi.set(__self__, "document", document)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment for the traffic policy.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def document(self) -> Optional[pulumi.Input[str]]:
        """
        Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)

        The following arguments are optional:
        """
        return pulumi.get(self, "document")

    @document.setter
    def document(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "document", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the traffic policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        Version number of the traffic policy. This value is automatically incremented by AWS after each update of this resource.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class TrafficPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 document: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Route53 Traffic Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.route53.TrafficPolicy("example",
            name="example",
            comment="example comment",
            document=\"\"\"{
          "AWSPolicyFormatVersion": "2015-10-01",
          "RecordType": "A",
          "Endpoints": {
            "endpoint-start-NkPh": {
              "Type": "value",
              "Value": "10.0.0.2"
            }
          },
          "StartEndpoint": "endpoint-start-NkPh"
        }
        \"\"\")
        ```

        ## Import

        Using `pulumi import`, import Route53 Traffic Policy using the `id` and `version`. For example:

        ```sh
         $ pulumi import aws:route53/trafficPolicy:TrafficPolicy example 01a52019-d16f-422a-ae72-c306d2b6df7e/1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Comment for the traffic policy.
        :param pulumi.Input[str] document: Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)
               
               The following arguments are optional:
        :param pulumi.Input[str] name: Name of the traffic policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TrafficPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Route53 Traffic Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.route53.TrafficPolicy("example",
            name="example",
            comment="example comment",
            document=\"\"\"{
          "AWSPolicyFormatVersion": "2015-10-01",
          "RecordType": "A",
          "Endpoints": {
            "endpoint-start-NkPh": {
              "Type": "value",
              "Value": "10.0.0.2"
            }
          },
          "StartEndpoint": "endpoint-start-NkPh"
        }
        \"\"\")
        ```

        ## Import

        Using `pulumi import`, import Route53 Traffic Policy using the `id` and `version`. For example:

        ```sh
         $ pulumi import aws:route53/trafficPolicy:TrafficPolicy example 01a52019-d16f-422a-ae72-c306d2b6df7e/1
        ```

        :param str resource_name: The name of the resource.
        :param TrafficPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TrafficPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 document: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TrafficPolicyArgs.__new__(TrafficPolicyArgs)

            __props__.__dict__["comment"] = comment
            if document is None and not opts.urn:
                raise TypeError("Missing required property 'document'")
            __props__.__dict__["document"] = document
            __props__.__dict__["name"] = name
            __props__.__dict__["type"] = None
            __props__.__dict__["version"] = None
        super(TrafficPolicy, __self__).__init__(
            'aws:route53/trafficPolicy:TrafficPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            document: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'TrafficPolicy':
        """
        Get an existing TrafficPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Comment for the traffic policy.
        :param pulumi.Input[str] document: Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)
               
               The following arguments are optional:
        :param pulumi.Input[str] name: Name of the traffic policy.
        :param pulumi.Input[str] type: DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
        :param pulumi.Input[int] version: Version number of the traffic policy. This value is automatically incremented by AWS after each update of this resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TrafficPolicyState.__new__(_TrafficPolicyState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["document"] = document
        __props__.__dict__["name"] = name
        __props__.__dict__["type"] = type
        __props__.__dict__["version"] = version
        return TrafficPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Comment for the traffic policy.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def document(self) -> pulumi.Output[str]:
        """
        Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)

        The following arguments are optional:
        """
        return pulumi.get(self, "document")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the traffic policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        Version number of the traffic policy. This value is automatically incremented by AWS after each update of this resource.
        """
        return pulumi.get(self, "version")

