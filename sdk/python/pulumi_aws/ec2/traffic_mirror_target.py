# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables


class TrafficMirrorTarget(pulumi.CustomResource):
    arn: pulumi.Output[str]
    """
    The ARN of the traffic mirror target.
    """
    description: pulumi.Output[str]
    """
    A description of the traffic mirror session.
    """
    network_interface_id: pulumi.Output[str]
    """
    The network interface ID that is associated with the target.
    """
    network_load_balancer_arn: pulumi.Output[str]
    """
    The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
    """
    tags: pulumi.Output[dict]
    """
    Key-value map of resource tags.
    """
    def __init__(__self__, resource_name, opts=None, description=None, network_interface_id=None, network_load_balancer_arn=None, tags=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides an Traffic mirror target.\
        Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring

        ## Example Usage

        To create a basic traffic mirror session

        ```python
        import pulumi
        import pulumi_aws as aws

        nlb = aws.ec2.TrafficMirrorTarget("nlb",
            description="NLB target",
            network_load_balancer_arn=aws_lb["lb"]["arn"])
        eni = aws.ec2.TrafficMirrorTarget("eni",
            description="ENI target",
            network_interface_id=aws_instance["test"]["primary_network_interface_id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description of the traffic mirror session.
        :param pulumi.Input[str] network_interface_id: The network interface ID that is associated with the target.
        :param pulumi.Input[str] network_load_balancer_arn: The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
        :param pulumi.Input[dict] tags: Key-value map of resource tags.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            __props__['network_interface_id'] = network_interface_id
            __props__['network_load_balancer_arn'] = network_load_balancer_arn
            __props__['tags'] = tags
            __props__['arn'] = None
        super(TrafficMirrorTarget, __self__).__init__(
            'aws:ec2/trafficMirrorTarget:TrafficMirrorTarget',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, arn=None, description=None, network_interface_id=None, network_load_balancer_arn=None, tags=None):
        """
        Get an existing TrafficMirrorTarget resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the traffic mirror target.
        :param pulumi.Input[str] description: A description of the traffic mirror session.
        :param pulumi.Input[str] network_interface_id: The network interface ID that is associated with the target.
        :param pulumi.Input[str] network_load_balancer_arn: The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
        :param pulumi.Input[dict] tags: Key-value map of resource tags.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["arn"] = arn
        __props__["description"] = description
        __props__["network_interface_id"] = network_interface_id
        __props__["network_load_balancer_arn"] = network_load_balancer_arn
        __props__["tags"] = tags
        return TrafficMirrorTarget(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
